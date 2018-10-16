import com.epam.techtalk.service.impl.JohnSnowGreetingService;

module epam.techtalk.service.impl.basic {
    requires epam.techtalk.service;

    provides com.epam.techtalk.service.GreetingService with JohnSnowGreetingService;
}