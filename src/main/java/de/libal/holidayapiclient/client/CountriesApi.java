package de.libal.holidayapiclient.client;

import de.libal.holidayapiclient.domain.ResponseWrapperCountry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Country API from holidayapi.com :: https://holidayapi.com/v1/countries
 * <p>
 *
 * @author Simon Hirscher mail to simon.hirscher@libal-tech.de
 */
@FeignClient(name = "holidayapi-countries", url = "https://holidayapi.com/v1/countries")
public interface CountriesApi {

    /**
     * Retrieves a list countries with states and provinces
     *
     * @param optionalCountry         return only the country with the specified code
     * @param optionalSearchMin2chars search countries by code and name, minimum 2 characters
     * @param optionalIsPublic        return only countries that have public holidays
     * @param key                     your API key
     * @return retrieves a list countries with states and provinces
     */
    @GetMapping
    ResponseWrapperCountry getCountries(@RequestParam("country") String optionalCountry,
                                        @RequestParam("search") String optionalSearchMin2chars,
                                        @RequestParam("public") Boolean optionalIsPublic,
                                        @RequestParam("key") String key);

}
