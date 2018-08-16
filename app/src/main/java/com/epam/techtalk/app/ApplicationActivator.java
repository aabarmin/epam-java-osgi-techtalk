package com.epam.techtalk.app;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ApplicationActivator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Application bundle starting");

//        final ServiceLoader<GreetingService> loader = ServiceLoader.load(GreetingService.class);
//        CollectionUtils.each(loader, service -> System.out.println(service.getGreetingMessage()));
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Application bundle stopping");
    }
}
