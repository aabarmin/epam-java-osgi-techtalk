package com.epam.techtalk.app;

import java.lang.module.Configuration;
import java.lang.module.ModuleFinder;
import java.nio.file.Paths;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

import com.epam.subbotnik.provider.ITSubbotnikCityProvider;

public class Application {
    private static ModuleLayer loadLayer(String moduleJar, String moduleName) {
        final ModuleFinder moduleFinder = ModuleFinder.of(Paths.get(
                moduleJar
        ));
        final ModuleLayer parentLayer = ModuleLayer.boot();
        final Configuration configuration = parentLayer.configuration()
                .resolve(moduleFinder, ModuleFinder.of(), Set.of(
                        moduleName
                ));
        final ModuleLayer moduleLayer = parentLayer.defineModulesWithOneLoader(
                configuration, ClassLoader.getSystemClassLoader()
        );
        return moduleLayer;
    }

    public static void main(String[] args) {
        final Map<String, String> layerConfigs = Map.of(
                "./dist/impl-izhevsk.jar", "epam.subbotnik.provider.izhevsk",
                "./dist/impl-spb.jar", "epam.subbotnik.provider.spb"
        );

        for (Map.Entry<String, String> entry : layerConfigs.entrySet()) {

            final ModuleLayer moduleLayer = loadLayer(entry.getKey(), entry.getValue());

            final ServiceLoader<ITSubbotnikCityProvider> serviceLoader =
                    ServiceLoader.load(moduleLayer, ITSubbotnikCityProvider.class);

            serviceLoader.stream()
                    .map(ServiceLoader.Provider::get)
                    .map(ITSubbotnikCityProvider::provideCity)
                    .forEach(System.out::println);
        }
    }
}
