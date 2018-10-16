package com.epam.techtalk.app;

import com.epam.techtalk.service.GreetingService;

import java.util.ServiceLoader;

public class Application {
    public static void main(String[] args) {
        final ServiceLoader<GreetingService> loader = ServiceLoader.load(GreetingService.class);
        loader.stream()
                .map(ServiceLoader.Provider::get)
                .map(GreetingService::getGreetingMessage)
                .forEach(System.out::println);
    }
}
