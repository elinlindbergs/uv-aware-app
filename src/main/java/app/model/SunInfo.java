package app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SunInfo {
        @JsonProperty("sun_times")
    SunTimes sunTimes;

    @JsonProperty("sun_position")
    SunPosition sunPos;



}
