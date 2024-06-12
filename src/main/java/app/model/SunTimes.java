package app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SunTimes {
        @JsonProperty("solarNoon")
    private String solarNoon;

    @JsonProperty("nadir")
    private String nadir;

    @JsonProperty("sunrise")
    private String sunrise;

    @JsonProperty("sunset")
    private String sunset;

    @JsonProperty("sunriseEnd")
    private String sunriseEnd;

    @JsonProperty("sunsetStart")
    private String sunsetStart;

    @JsonProperty("dawn")
    private String dawn;

    @JsonProperty("dusk")
    private String dusk;

    @JsonProperty("nauticalDawn")
    private String nauticalDawn;

    @JsonProperty("nauticalDusk")
    private String nauticalDusk;

    @JsonProperty("nightEnd")
    private String nightEnd;

    @JsonProperty("night")
    private String night;

    @JsonProperty("goldenHourEnd")
    private String goldenHourEnd;

    @JsonProperty("goldenHour")
    private String goldenHour;

    // Getters and setters
    public String getSolarNoon() {
        return solarNoon;
    }

    public void setSolarNoon(String solarNoon) {
        this.solarNoon = solarNoon;
    }

    public String getNadir() {
        return nadir;
    }

    public void setNadir(String nadir) {
        this.nadir = nadir;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getSunriseEnd() {
        return sunriseEnd;
    }

    public void setSunriseEnd(String sunriseEnd) {
        this.sunriseEnd = sunriseEnd;
    }

    public String getSunsetStart() {
        return sunsetStart;
    }

    public void setSunsetStart(String sunsetStart) {
        this.sunsetStart = sunsetStart;
    }

    public String getDawn() {
        return dawn;
    }

    public void setDawn(String dawn) {
        this.dawn = dawn;
    }

    public String getDusk() {
        return dusk;
    }

    public void setDusk(String dusk) {
        this.dusk = dusk;
    }

    public String getNauticalDawn() {
        return nauticalDawn;
    }

    public void setNauticalDawn(String nauticalDawn) {
        this.nauticalDawn = nauticalDawn;
    }

    public String getNauticalDusk() {
        return nauticalDusk;
    }

    public void setNauticalDusk(String nauticalDusk) {
        this.nauticalDusk = nauticalDusk;
    }

    public String getNightEnd() {
        return nightEnd;
    }

    public void setNightEnd(String nightEnd) {
        this.nightEnd = nightEnd;
    }

    public String getNight() {
        return night;
    }

    public void setNight(String night) {
        this.night = night;
    }

    public String getGoldenHourEnd() {
        return goldenHourEnd;
    }

    public void setGoldenHourEnd(String goldenHourEnd) {
        this.goldenHourEnd = goldenHourEnd;
    }

    public String getGoldenHour() {
        return goldenHour;
    }

    public void setGoldenHour(String goldenHour) {
        this.goldenHour = goldenHour;
    }
}
