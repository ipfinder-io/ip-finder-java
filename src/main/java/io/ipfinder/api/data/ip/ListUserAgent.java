/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListUserAgent {

    private String userAgent;
    private String browserName;
    private String osName;
    private String deviceType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListUserAgent() {
    }

    /**
     * 
     * @param browserName
     * @param userAgent
     * @param deviceType
     * @param osName
     */
    public ListUserAgent(String userAgent, String browserName, String osName, String deviceType) {
        super();
        this.userAgent = userAgent;
        this.browserName = browserName;
        this.osName = osName;
        this.deviceType = deviceType;
    }

    public String getUserAgent() {
        return userAgent;
    }

    

    public String getBrowserName() {
        return browserName;
    }

    

    public String getOsName() {
        return osName;
    }

    

    public String getDeviceType() {
        return deviceType;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("userAgent", userAgent).append("browserName", browserName).append("osName", osName).append("deviceType", deviceType).append("additionalProperties", additionalProperties).toString();
    }

}
