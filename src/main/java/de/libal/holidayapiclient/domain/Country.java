package de.libal.holidayapiclient.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Country {

    private String code;

    private String name;

    private String flag;

    private Map<String, String> codes = new HashMap<>();

    private List<String> languages = new ArrayList<>();

    private List<Subdivision> subdivisions = new ArrayList<>();

    public String getCode() {
        return code;
    }

    public Country setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }

    public String getFlag() {
        return flag;
    }

    public Country setFlag(String flag) {
        this.flag = flag;
        return this;
    }

    public Map<String, String> getCodes() {
        return codes;
    }

    public Country setCodes(Map<String, String> codes) {
        this.codes = codes;
        return this;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public Country setLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }

    public List<Subdivision> getSubdivisions() {
        return subdivisions;
    }

    public Country setSubdivisions(List<Subdivision> subdivisions) {
        this.subdivisions = subdivisions;
        return this;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", flag='" + flag + '\'' +
                ", codes=" + codes +
                ", languages=" + languages +
                ", subdivisions=" + subdivisions +
                '}';
    }
}
