package app.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UvInfo {

    @JsonProperty("uv")
    private double uv;

    @JsonProperty("uv_time")
    private String uvTime;
    
    @JsonProperty("uv_max")
    private double uvMax;
    
    @JsonProperty("uv_max_time")
    private String uvMaxTime;
    
    @JsonProperty("ozone")
    private double ozone;
    
    @JsonProperty("ozone_time")
    private String ozoneTime;

    @JsonProperty("safe_exposure_time")
    Map<String, Integer> safeExposureTime;

    @JsonProperty("sun_info")
    SunInfo sunInfo;


    public double getUv(){
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public String getUvTime() {
        return uvTime;
    }

    public void setUvTime(String uvTime) {
        this.uvTime = uvTime;
    }

    public double getUvMax() {
        return uvMax;
    }

    public void setUvMax(double uvMax) {
        this.uvMax = uvMax;
    }

    public String getUvMaxTime() {
        return uvMaxTime;
    }
    
    public void setUvMaxTime(String uvMaxTime) {
        this.uvMaxTime = uvMaxTime;
    }

    public double getOzone() {
        return ozone;
    }
    public void setOzone(double ozone) {
        this.ozone = ozone;
    }

    public String getOzoneTime() {
        return ozoneTime;
    }
    public void setOzoneTime(String ozoneTime) {
        this.ozoneTime = ozoneTime;
    }


    public Map<String, Integer> getSafeExposureTime(){
        return safeExposureTime;

    }

    public void setSafeExposureTime(Map<String, Integer>safeExposureTime){
        this.safeExposureTime = safeExposureTime;
    }

    public SunInfo getSunInfo(){
        return sunInfo;
    }

    public void setSunInfo(SunInfo sunInfo){
        this.sunInfo = sunInfo;
    }

}
