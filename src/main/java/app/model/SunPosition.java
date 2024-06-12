package app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SunPosition {
    private double azimuth;
    private double altitude;


    @JsonProperty("azimuth")
    public double getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(double azimuth) {
        this.azimuth = azimuth;
    }

    @JsonProperty("altitude")
    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }


}
