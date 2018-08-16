package com.epam.techtalk.app;

import com.epam.techtalk.service.GreetingService;
import com.epam.techtalk.utils.CollectionUtils;

import java.util.ServiceLoader;

public class Application {
    public static void main(String[] args) {
        final ServiceLoader<GreetingService> loader = ServiceLoader.load(GreetingService.class);
        CollectionUtils.each(loader, service -> System.out.println(service.getGreetingMessage()));
    }
}
