package de.libal.holidayapiclient.domain;

public class WeekdayElement {

    private String name;

    private String numeric;

    public String getName() {
        return name;
    }

    public WeekdayElement setName(String name) {
        this.name = name;
        return this;
    }

    public String getNumeric() {
        return numeric;
    }

    public WeekdayElement setNumeric(String numeric) {
        this.numeric = numeric;
        return this;
    }

    @Override
    public String toString() {
        return "WeekdayElement{" +
                "name='" + name + '\'' +
                ", numeric='" + numeric + '\'' +
                '}';
    }
}
