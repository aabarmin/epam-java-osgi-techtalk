package com.epam.techtalk.service.impl;

import com.epam.techtalk.service.GreetingService;

public class TerminatorGreetingService implements GreetingService {
    @Override
    public String getGreetingMessage() {
        return "Hasta la vista!";
    }
}
