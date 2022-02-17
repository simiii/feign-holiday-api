package de.libal.holidayapiclient.domain;

import java.util.List;

public class Subdivision {

    private String code;

    private String name;

    private List<String> languages;

    public String getCode() {
        return code;
    }

    public Subdivision setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public Subdivision setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public Subdivision setLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }

    @Override
    public String toString() {
        return "Subdivision{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", languages=" + languages +
                '}';
    }
}
