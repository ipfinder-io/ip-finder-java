/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.asn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Prefixes {

    private long totalPrefixes;
    private List<String> listPrefixes = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Prefixes() {
    }

    /**
     * 
     * @param listPrefixes
     * @param totalPrefixes
     */
    public Prefixes(long totalPrefixes, List<String> listPrefixes) {
        super();
        this.totalPrefixes = totalPrefixes;
        this.listPrefixes = listPrefixes;
    }

    public long getTotalPrefixes() {
        return totalPrefixes;
    }

    

    public List<String> getListPrefixes() {
        return listPrefixes;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalPrefixes", totalPrefixes).append("listPrefixes", listPrefixes).append("additionalProperties", additionalProperties).toString();
    }

}
