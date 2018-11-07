import com.epam.subbotnik.provider.ITSubbotnikCityProvider;
import com.epam.subbotnik.provider.impl.SpbSubbotnikCityProvider;

module epam.subbotnik.provider.spb {
    requires epam.subbotnik.provider;

    provides ITSubbotnikCityProvider with SpbSubbotnikCityProvider;
}