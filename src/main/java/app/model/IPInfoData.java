package app.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class IPInfoData {

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("city")
    private String city;

    @JsonProperty("region")
    private String region;

    @JsonProperty("country")
    private String country;

    @JsonProperty("loc")
    private String loc;

    @JsonProperty("org")
    private String org;

    @JsonProperty("postal")
    private String postal;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("readme")
    private String readme;

    private double latitude;
    private double longitude;

    public IPInfoData() {
        // Default constructor
    }

    public IPInfoData(String ip, String city, String region, String country, String loc, String org, String postal, String timezone, String readme) {
        this.ip = ip;
        this.city = city;
        this.region = region;
        this.country = country;
        this.loc = loc;
        this.org = org;
        this.postal = postal;
        this.timezone = timezone;
        this.readme = readme;
    }

    private void updateCoordinates(String loc) {
        // Split the loc string into latitude and longitude values
        String[] coordinates = loc.split(",");
        if (coordinates.length == 2) {
            latitude = Double.parseDouble(coordinates[0]);
            longitude = Double.parseDouble(coordinates[1]);
        } else {
            // Handle invalid loc format
            latitude = 0.0; // Or any other default value
            longitude = 0.0; // Or any other default value
        }
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        updateCoordinates(loc); // Call the updateCoordinates method to split loc into latitude and longitude
        this.loc = loc;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getReadme() {
        return readme;
    }

    public void setReadme(String readme) {
        this.readme = readme;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


}
