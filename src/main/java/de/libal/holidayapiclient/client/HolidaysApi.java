package de.libal.holidayapiclient.client;

import de.libal.holidayapiclient.domain.ResponseWrapperHoliday;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Holiday API from holidayapi.com :: https://holidayapi.com/v1/holidays
 * <p>
 *
 * @author Simon Hirscher mail to simon.hirscher@libal-tech.de
 */
@FeignClient(name = "holidayapi-holidays", url = "https://holidayapi.com/v1/holidays")
public interface HolidaysApi {

    /**
     * Retrieves a list public holidays and observances for countries, states and provinces
     *
     * @param year                                   4 digit year in ISO 8601 format
     * @param country                                for countries, ISO 3166-1 alpha-2 or ISO 3166-1 alpha-3 format. For states provinces (with our States, Provinces plan), ISO 3166-2 format. Accepts up to 10 comma separated values
     * @param optionalLanguage                       ISO 639-1 format (with exceptions)
     * @param optionalSearch                         search holidays by name, Minimum 5 characters
     * @param optionalMonth                          1 or 2 digit month (1-12).
     * @param optionalDay                            1 or 2 digit day (1-31 depending on the month), must be used with month.
     * @param optionalIsPublic                       return only public holidays
     * @param optionalIsReturningSubDivisionHolidays return state province holidays alongside countrywide holidays, available on states, provinces plan
     * @param optionalIsPrevious                     return the first day of holidays that occur before the specific date, month and day are required, cannot be used with upcoming
     * @param optionalIsUpcoming                     return the first day of holidays that occur after the specific date, month and day are required, cannot be used with previous
     * @param key                                    your API key
     * @return retrieves a list public holidays and observances for countries, states and provinces
     */
    @GetMapping
    ResponseWrapperHoliday getHolidays(@RequestParam("year") Integer year,
                                       @RequestParam("country") String country,
                                       @RequestParam("language") String optionalLanguage,
                                       @RequestParam("search") String optionalSearch,
                                       @RequestParam("month") Integer optionalMonth,
                                       @RequestParam("day") Integer optionalDay,
                                       @RequestParam("public") Boolean optionalIsPublic,
                                       @RequestParam("subDivisions") Boolean optionalIsReturningSubDivisionHolidays,
                                       @RequestParam("previous") Boolean optionalIsPrevious,
                                       @RequestParam("upcoming") Boolean optionalIsUpcoming,
                                       @RequestParam("key") String key);

}
