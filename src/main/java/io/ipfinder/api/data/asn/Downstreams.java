/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.asn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Downstreams {

    private long totalDownstreams;
    private List<String> listDownstreams = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Downstreams() {
    }

    /**
     * 
     * @param listDownstreams
     * @param totalDownstreams
     */
    public Downstreams(long totalDownstreams, List<String> listDownstreams) {
        super();
        this.totalDownstreams = totalDownstreams;
        this.listDownstreams = listDownstreams;
    }

    public long getTotalDownstreams() {
        return totalDownstreams;
    }

    

    public List<String> getListDownstreams() {
        return listDownstreams;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalDownstreams", totalDownstreams).append("listDownstreams", listDownstreams).append("additionalProperties", additionalProperties).toString();
    }

}
