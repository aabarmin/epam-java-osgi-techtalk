package com.epam.subbotnik.provider.spb;

import com.epam.subbotnik.provider.ITSubbotnikCityProvider;

public class SpbSubbotnikCityProvider implements ITSubbotnikCityProvider {
    @Override
    public String provideCity() {
        return "Hello from SPb!";
    }
}
