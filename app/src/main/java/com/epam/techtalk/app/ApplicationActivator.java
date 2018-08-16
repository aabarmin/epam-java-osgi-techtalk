package com.epam.techtalk.app;

import com.epam.techtalk.service.GreetingService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class ApplicationActivator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Application bundle starting");

        final ServiceReference<?> serviceReference = context.getServiceReference(GreetingService.class.getName());
        final GreetingService service = (GreetingService) context.getService(serviceReference);
        System.out.println(service.getGreetingMessage());
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Application bundle stopping");
    }
}
