/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Header {

    private long totalUserAgent;
    private List<ListUserAgent> listUserAgent = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Header() {
    }

    /**
     * 
     * @param totalUserAgent
     * @param listUserAgent
     */
    public Header(long totalUserAgent, List<ListUserAgent> listUserAgent) {
        super();
        this.totalUserAgent = totalUserAgent;
        this.listUserAgent = listUserAgent;
    }

    public long getTotalUserAgent() {
        return totalUserAgent;
    }

    

    public List<ListUserAgent> getListUserAgent() {
        return listUserAgent;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalUserAgent", totalUserAgent).append("listUserAgent", listUserAgent).append("additionalProperties", additionalProperties).toString();
    }

}
