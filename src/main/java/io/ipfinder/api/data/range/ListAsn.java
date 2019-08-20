/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.range;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListAsn {

    private String asn;
    private String orgId;
    private String totalPrefix;
    private String totalV4;
    private String totalV6;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListAsn() {
    }

    /**
     * 
     * @param orgId
     * @param totalPrefix
     * @param asn
     * @param totalV6
     * @param totalV4
     */
    public ListAsn(String asn, String orgId, String totalPrefix, String totalV4, String totalV6) {
        super();
        this.asn = asn;
        this.orgId = orgId;
        this.totalPrefix = totalPrefix;
        this.totalV4 = totalV4;
        this.totalV6 = totalV6;
    }

    public String getAsn() {
        return asn;
    }

    

    public String getOrgId() {
        return orgId;
    }

    

    public String getTotalPrefix() {
        return totalPrefix;
    }

    

    public String getTotalV4() {
        return totalV4;
    }

    

    public String getTotalV6() {
        return totalV6;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("asn", asn).append("orgId", orgId).append("totalPrefix", totalPrefix).append("totalV4", totalV4).append("totalV6", totalV6).append("additionalProperties", additionalProperties).toString();
    }

}
