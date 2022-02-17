package de.libal.holidayapiclient.domain;

import java.util.ArrayList;
import java.util.List;

public class ResponseWrapperLanguage {

    private List<Language> languages = new ArrayList<>();

    public List<Language> getLanguages() {
        return languages;
    }

    public ResponseWrapperLanguage setLanguages(List<Language> languages) {
        this.languages = languages;
        return this;
    }

}
