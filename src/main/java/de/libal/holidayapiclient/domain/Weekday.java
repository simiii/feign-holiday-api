package de.libal.holidayapiclient.domain;

public class Weekday {

    private WeekdayElement date;

    private WeekdayElement observed;

    public WeekdayElement getDate() {
        return date;
    }

    public Weekday setDate(WeekdayElement date) {
        this.date = date;
        return this;
    }

    public WeekdayElement getObserved() {
        return observed;
    }

    public Weekday setObserved(WeekdayElement observed) {
        this.observed = observed;
        return this;
    }

    @Override
    public String toString() {
        return "Weekday{" +
                "date=" + date +
                ", observed=" + observed +
                '}';
    }
}
