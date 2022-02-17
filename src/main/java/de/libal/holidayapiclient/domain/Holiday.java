package de.libal.holidayapiclient.domain;

/**
 * A holiday representing the following json
 *
 * {
 * 	"name": "Father's Day",
 * 	"date": "2021-05-13",
 * 	"observed": "2021-05-13",
 * 	"public": false,
 * 	"country": "DE",
 * 	"uuid": "33e7c559-cb61-4e87-8f9d-ed2855568121",
 * 	"weekday": {
 * 		"date": {
 * 			"name": "Thursday",
 * 			"numeric": "4"
 *       },
 * 		"observed": {
 * 			"name": "Thursday",
 * 			"numeric": "4"
 *      }
 *  }
 * }
 */
public class Holiday {

    private String name;

    private String date;

    private String observed;

    private boolean isPublic;

    private String country;

    private String uuid;

    private Weekday weekday;

    public String getName() {
        return name;
    }

    public Holiday setName(String name) {
        this.name = name;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Holiday setDate(String date) {
        this.date = date;
        return this;
    }

    public String getObserved() {
        return observed;
    }

    public Holiday setObserved(String observed) {
        this.observed = observed;
        return this;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public Holiday setPublic(boolean aPublic) {
        isPublic = aPublic;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Holiday setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public Holiday setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public Holiday setWeekday(Weekday weekday) {
        this.weekday = weekday;
        return this;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", observed='" + observed + '\'' +
                ", isPublic=" + isPublic +
                ", country='" + country + '\'' +
                ", uuid='" + uuid + '\'' +
                ", weekday=" + weekday +
                '}';
    }
}
