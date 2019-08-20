/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.asn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Peers {

    private long totalPeers;
    private List<String> listPeers = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Peers() {
    }

    /**
     * 
     * @param listPeers
     * @param totalPeers
     */
    public Peers(long totalPeers, List<String> listPeers) {
        super();
        this.totalPeers = totalPeers;
        this.listPeers = listPeers;
    }

    public long getTotalPeers() {
        return totalPeers;
    }

    

    public List<String> getListPeers() {
        return listPeers;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalPeers", totalPeers).append("listPeers", listPeers).append("additionalProperties", additionalProperties).toString();
    }

}
