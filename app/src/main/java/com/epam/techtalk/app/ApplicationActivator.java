package com.epam.techtalk.app;

import com.epam.techtalk.service.GreetingService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import java.util.Collection;

public class ApplicationActivator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Application bundle starting");

        final Collection<ServiceReference<GreetingService>> references =
                context.getServiceReferences(GreetingService.class, null);

        for (ServiceReference<GreetingService> reference : references) {
            final GreetingService service = context.getService(reference);
            System.out.println(service.getGreetingMessage());
        }

    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Application bundle stopping");
    }
}
