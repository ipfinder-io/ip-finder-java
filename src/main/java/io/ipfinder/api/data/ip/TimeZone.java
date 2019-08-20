/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class TimeZone {

    private String id;
    private String uTC;
    private long gmtOffset;
    private String currentTime;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TimeZone() {
    }

    /**
     * 
     * @param currentTime
     * @param uTC
     * @param id
     * @param gmtOffset
     */
    public TimeZone(String id, String uTC, long gmtOffset, String currentTime) {
        super();
        this.id = id;
        this.uTC = uTC;
        this.gmtOffset = gmtOffset;
        this.currentTime = currentTime;
    }

    public String getId() {
        return id;
    }

    

    public String getUTC() {
        return uTC;
    }

    

    public long getGmtOffset() {
        return gmtOffset;
    }

    

    public String getCurrentTime() {
        return currentTime;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("uTC", uTC).append("gmtOffset", gmtOffset).append("currentTime", currentTime).append("additionalProperties", additionalProperties).toString();
    }

}
