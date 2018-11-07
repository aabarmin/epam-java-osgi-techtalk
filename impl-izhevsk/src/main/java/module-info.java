import com.epam.subbotnik.provider.izhevsk.IzhevskSubbotnikCityProvider;
import com.epam.subbotnik.provider.ITSubbotnikCityProvider;

module epam.subbotnik.provider.izhevsk {
    requires epam.subbotnik.provider;

    provides ITSubbotnikCityProvider with IzhevskSubbotnikCityProvider;
}