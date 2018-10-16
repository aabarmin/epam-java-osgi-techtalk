package com.epam.techtalk.app;

import com.epam.techtalk.service.GreetingService;

import java.lang.module.Configuration;
import java.lang.module.ModuleFinder;
import java.nio.file.Paths;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

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
                "./dist/impl-default.jar", "epam.techtalk.service.impl.basic",
                "./dist/impl-advanced.jar", "epam.techtalk.service.impl.advanced"
        );

        for (Map.Entry<String, String> entry : layerConfigs.entrySet()) {
            final ModuleLayer moduleLayer = loadLayer(entry.getKey(), entry.getValue());
            final ServiceLoader<GreetingService> serviceLoader = ServiceLoader.load(moduleLayer, GreetingService.class);
            serviceLoader.stream()
                    .map(ServiceLoader.Provider::get)
                    .map(GreetingService::getGreetingMessage)
                    .forEach(System.out::println);
        }
    }
}
