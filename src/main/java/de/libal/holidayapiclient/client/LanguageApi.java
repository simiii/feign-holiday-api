package de.libal.holidayapiclient.client;

import de.libal.holidayapiclient.domain.ResponseWrapperLanguage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Language API from holidayapi.com :: https://holidayapi.com/v1/languages
 * <p>
 *
 * @author Simon Hirscher mail to simon.hirscher@libal-tech.de
 */
@FeignClient(name = "holidayapi-languages", url = "https://holidayapi.com/v1/languages")
public interface LanguageApi {

    /**
     * Retrieves a list languages
     *
     * @param optionalLanguage        return only the language with the specified code
     * @param optionalSearchMin2chars search languages by code and name, minimum 2 characters
     * @param key                     your API key
     * @return retrieves a list languages
     */
    @GetMapping
    ResponseWrapperLanguage getLanguages(@RequestParam("language") String optionalLanguage,
                                         @RequestParam("search") String optionalSearchMin2chars,
                                         @RequestParam("key") String key);

}
