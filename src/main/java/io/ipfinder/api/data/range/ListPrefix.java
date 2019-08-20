/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListPrefix {

    private String asn;
    private String prefix;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListPrefix() {
    }

    /**
     * 
     * @param prefix
     * @param asn
     */
    public ListPrefix(String asn, String prefix) {
        super();
        this.asn = asn;
        this.prefix = prefix;
    }

    public String getAsn() {
        return asn;
    }

    

    public String getPrefix() {
        return prefix;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("asn", asn).append("prefix", prefix).append("additionalProperties", additionalProperties).toString();
    }

}
