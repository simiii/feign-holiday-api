package de.libal.holidayapiclient.domain;

import java.util.ArrayList;
import java.util.List;

public class ResponseWrapperCountry extends ResponseWrapper {

    private List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return countries;
    }

    public ResponseWrapperCountry setCountries(List<Country> countries) {
        this.countries = countries;
        return this;
    }

}
