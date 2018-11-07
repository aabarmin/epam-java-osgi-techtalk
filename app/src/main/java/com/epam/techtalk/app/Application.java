package com.epam.techtalk.app;

import java.util.ServiceLoader;

import com.epam.subbotnik.provider.ITSubbotnikCityProvider;

public class Application {
    public static void main(String[] args) {
        final ServiceLoader<ITSubbotnikCityProvider> loader = ServiceLoader.load(ITSubbotnikCityProvider.class);
        loader.stream()
                .map(ServiceLoader.Provider::get)
                .map(ITSubbotnikCityProvider::provideCity)
                .forEach(System.out::println);
    }
}
