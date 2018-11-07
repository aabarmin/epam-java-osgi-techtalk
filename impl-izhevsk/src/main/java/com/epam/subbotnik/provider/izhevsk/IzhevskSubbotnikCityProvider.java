package com.epam.subbotnik.provider.izhevsk;

import com.epam.subbotnik.provider.ITSubbotnikCityProvider;

public class IzhevskSubbotnikCityProvider implements ITSubbotnikCityProvider {
    @Override
    public String provideCity() {
        return "Hello from Izhevsk!";
    }
}
