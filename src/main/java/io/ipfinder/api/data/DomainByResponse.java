/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */

package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;
import io.ipfinder.api.data.domainby.ListDomain;

public class DomainByResponse {

    private String status;
    private String statusMessage;
    private String selectBy;
    private long totalDomain;
    private List<List<ListDomain>> listDomain = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DomainByResponse() {
    }

    /**
     * 
     * @param listDomain
     * @param status
     * @param selectBy
     * @param totalDomain
     * @param statusMessage
     */
    public DomainByResponse(String status, String statusMessage, String selectBy, long totalDomain, List<List<ListDomain>> listDomain) {
        super();
        this.status = status;
        this.statusMessage = statusMessage;
        this.selectBy = selectBy;
        this.totalDomain = totalDomain;
        this.listDomain = listDomain;
    }

    public String getStatus() {
        return status;
    }

    

    public String getStatusMessage() {
        return statusMessage;
    }

    

    public String getSelectBy() {
        return selectBy;
    }

    

    public long getTotalDomain() {
        return totalDomain;
    }

    

    public List<List<ListDomain>> getListDomain() {
        return listDomain;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("statusMessage", statusMessage).append("selectBy", selectBy).append("totalDomain", totalDomain).append("listDomain", listDomain).append("additionalProperties", additionalProperties).toString();
    }

}
