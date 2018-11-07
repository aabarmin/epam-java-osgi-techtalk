package com.epam.subbotnik.provider.impl;

import com.epam.subbotnik.provider.ITSubbotnikCityProvider;

public class SpbSubbotnikCityProvider implements ITSubbotnikCityProvider {
    @Override
    public String provideCity() {
        return "Hello from SPb!";
    }
}
