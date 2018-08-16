module epam.techtalk.service.impl.def {
    requires epam.techtalk.service;

    provides com.epam.techtalk.service.GreetingService with com.epam.techtalk.service.def.JohnSnowGreetingService;
}