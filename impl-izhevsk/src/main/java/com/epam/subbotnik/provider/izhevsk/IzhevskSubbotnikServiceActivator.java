package com.epam.subbotnik.provider.izhevsk;

import com.epam.subbotnik.provider.ITSubbotnikCityProvider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class IzhevskSubbotnikServiceActivator implements BundleActivator {
    private ServiceRegistration<?> registration;

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Starting Izhevsk ITSubbotnik provider bundle");
        final ITSubbotnikCityProvider provider = new IzhevskSubbotnikCityProvider();

        registration = context.registerService(
                ITSubbotnikCityProvider.class.getName(),
                provider,
                null
        );
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        registration.unregister();
    }
}
