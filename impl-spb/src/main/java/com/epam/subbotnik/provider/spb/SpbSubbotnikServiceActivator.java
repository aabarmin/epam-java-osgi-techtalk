package com.epam.subbotnik.provider.spb;

import com.epam.subbotnik.provider.ITSubbotnikCityProvider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class SpbSubbotnikServiceActivator implements BundleActivator {
    private ServiceRegistration<?> registration;

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Starting SPb ITSubbotnik provider bundle");
        final ITSubbotnikCityProvider provider = new SpbSubbotnikCityProvider();

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
