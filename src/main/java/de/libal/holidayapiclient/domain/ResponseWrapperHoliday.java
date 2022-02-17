package de.libal.holidayapiclient.domain;

import java.util.ArrayList;
import java.util.List;

public class ResponseWrapperHoliday {

    private List<Holiday> holidays = new ArrayList<>();

    public List<Holiday> getHolidays() {
        return holidays;
    }

    public ResponseWrapperHoliday setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
        return this;
    }

}
