/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.asn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Upstreams {

    private long totalUpstreams;
    private List<String> listUpstreams = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Upstreams() {
    }

    /**
     * 
     * @param totalUpstreams
     * @param listUpstreams
     */
    public Upstreams(long totalUpstreams, List<String> listUpstreams) {
        super();
        this.totalUpstreams = totalUpstreams;
        this.listUpstreams = listUpstreams;
    }

    public long getTotalUpstreams() {
        return totalUpstreams;
    }

    

    public List<String> getListUpstreams() {
        return listUpstreams;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalUpstreams", totalUpstreams).append("listUpstreams", listUpstreams).append("additionalProperties", additionalProperties).toString();
    }

}
