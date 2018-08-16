package com.epam.techtalk.service.advanced;

import com.epam.techtalk.service.GreetingService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class AdvancedServiceActivator implements BundleActivator {
    private ServiceRegistration<?> registration;

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Starting advanced greeting service");
        final TerminatorGreetingService greetingService = new TerminatorGreetingService();

        registration = context.registerService(
                GreetingService.class.getName(),
                greetingService,
                null
        );
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        registration.unregister();
    }
}
