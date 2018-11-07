package com.epam.subbotnik.app;

import com.epam.subbotnik.provider.ITSubbotnikCityProvider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import java.util.Collection;

public class ApplicationActivator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Application bundle starting");

        final Collection<ServiceReference<ITSubbotnikCityProvider>> references =
                context.getServiceReferences(ITSubbotnikCityProvider.class, null);

        for (ServiceReference<ITSubbotnikCityProvider> reference : references) {
            final ITSubbotnikCityProvider provider = context.getService(reference);
            System.out.println(provider.provideCity());
        }

    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Application bundle stopping");
    }
}
