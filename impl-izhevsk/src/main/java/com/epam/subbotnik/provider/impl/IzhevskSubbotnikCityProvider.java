package com.epam.subbotnik.provider.impl;

import com.epam.subbotnik.provider.ITSubbotnikCityProvider;

public class IzhevskSubbotnikCityProvider implements ITSubbotnikCityProvider {
    @Override
    public String provideCity() {
        return "Hello from Izhevsk!";
    }
}
