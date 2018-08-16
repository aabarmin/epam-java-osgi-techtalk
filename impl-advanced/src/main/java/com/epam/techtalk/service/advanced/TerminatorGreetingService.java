package com.epam.techtalk.service.advanced;

import com.epam.techtalk.service.GreetingService;

public class TerminatorGreetingService implements GreetingService {
    @Override
    public String getGreetingMessage() {
        return "Asta la vista!";
    }
}
