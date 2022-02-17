package de.libal.holidayapiclient.domain;

public abstract class ResponseWrapper {

    private int status;

    private String warning;

    public int getStatus() {
        return status;
    }

    public ResponseWrapper setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getWarning() {
        return warning;
    }

    public ResponseWrapper setWarning(String warning) {
        this.warning = warning;
        return this;
    }

    @Override
    public String toString() {
        return "HolidayApiResponseWrapper{" +
                "status=" + status +
                ", warning='" + warning + '\'' +
                '}';
    }

}
