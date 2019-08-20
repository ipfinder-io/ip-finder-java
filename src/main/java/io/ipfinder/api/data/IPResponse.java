/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */

package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;
import io.ipfinder.api.data.ip.*;

public class IPResponse {

    private String status;
    private String statusMessage;
    private String ip;
    private String type;
    private String continentCode;
    private String continentName;
    private String countryCode;
    private String countryName;
    private String countryNativeName;
    private String regionName;
    private String city;
    private String latitude;
    private String longitude;
    private Location location;
    private TimeZone timeZone;
    private Currency currency;
    private Languages languages;
    private Connection connection;
    private Security security;
    private Header header;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public IPResponse() {
    }

    /**
     * 
     * @param connection
     * @param countryName
     * @param location
     * @param status
     * @param countryNativeName
     * @param countryCode
     * @param regionName
     * @param timeZone
     * @param security
     * @param type
     * @param header
     * @param currency
     * @param statusMessage
     * @param ip
     * @param city
     * @param languages
     * @param continentName
     * @param continentCode
     * @param longitude
     * @param latitude
     */
    public IPResponse(String status, String statusMessage, String ip, String type, String continentCode, String continentName, String countryCode, String countryName, String countryNativeName, String regionName, String city, String latitude, String longitude, Location location, TimeZone timeZone, Currency currency, Languages languages, Connection connection, Security security, Header header) {
        super();
        this.status = status;
        this.statusMessage = statusMessage;
        this.ip = ip;
        this.type = type;
        this.continentCode = continentCode;
        this.continentName = continentName;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryNativeName = countryNativeName;
        this.regionName = regionName;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.location = location;
        this.timeZone = timeZone;
        this.currency = currency;
        this.languages = languages;
        this.connection = connection;
        this.security = security;
        this.header = header;
    }

    public String getStatus() {
        return status;
    }

    

    public String getStatusMessage() {
        return statusMessage;
    }

    

    public String getIp() {
        return ip;
    }

    

    public String getType() {
        return type;
    }

    

    public String getContinentCode() {
        return continentCode;
    }

    

    public String getContinentName() {
        return continentName;
    }

    

    public String getCountryCode() {
        return countryCode;
    }

    

    public String getCountryName() {
        return countryName;
    }

    

    public String getCountryNativeName() {
        return countryNativeName;
    }

    

    public String getRegionName() {
        return regionName;
    }

    

    public String getCity() {
        return city;
    }

    

    public String getLatitude() {
        return latitude;
    }

    

    public String getLongitude() {
        return longitude;
    }

    

    public Location getLocation() {
        return location;
    }

    

    public TimeZone getTimeZone() {
        return timeZone;
    }

    

    public Currency getCurrency() {
        return currency;
    }

    

    public Languages getLanguages() {
        return languages;
    }

    

    public Connection getConnection() {
        return connection;
    }

    

    public Security getSecurity() {
        return security;
    }

    

    public Header getHeader() {
        return header;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("statusMessage", statusMessage).append("ip", ip).append("type", type).append("continentCode", continentCode).append("continentName", continentName).append("countryCode", countryCode).append("countryName", countryName).append("countryNativeName", countryNativeName).append("regionName", regionName).append("city", city).append("latitude", latitude).append("longitude", longitude).append("location", location).append("timeZone", timeZone).append("currency", currency).append("languages", languages).append("connection", connection).append("security", security).append("header", header).append("additionalProperties", additionalProperties).toString();
    }

}
