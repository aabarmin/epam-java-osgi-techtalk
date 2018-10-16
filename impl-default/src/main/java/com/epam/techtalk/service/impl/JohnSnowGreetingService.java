package com.epam.techtalk.service.impl;

import com.epam.techtalk.service.GreetingService;

public class JohnSnowGreetingService implements GreetingService {
    @Override
    public String getGreetingMessage() {
        return "I'm alive!";
    }
}
