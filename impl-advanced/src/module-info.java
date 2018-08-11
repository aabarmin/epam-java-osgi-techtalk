import com.epam.techtalk.service.advanced.TerminatorGreetingService;

module epam.techtalk.service.impl.advanced {
    requires epam.techtalk.service;

    provides com.epam.techtalk.service.GreetingService with TerminatorGreetingService;
}