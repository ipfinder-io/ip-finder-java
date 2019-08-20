/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;
import io.ipfinder.api.data.range.*;

public class RangeResponse {

    private String status;
    private String statusMessage;
    private String orgName;
    private String continentCode;
    private String continentName;
    private String countryName;
    private String domain;
    private String numRanges;
    private String numIpv4;
    private String numIpv6;
    private long numAsn;
    private List<ListAsn> listAsn = null;
    private List<ListPrefix> listPrefixes = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RangeResponse() {
    }

    /**
     * 
     * @param countryName
     * @param status
     * @param listPrefixes
     * @param orgName
     * @param statusMessage
     * @param numAsn
     * @param numIpv4
     * @param continentName
     * @param numIpv6
     * @param continentCode
     * @param domain
     * @param numRanges
     * @param listAsn
     */
    public RangeResponse(String status, String statusMessage, String orgName, String continentCode, String continentName, String countryName, String domain, String numRanges, String numIpv4, String numIpv6, long numAsn, List<ListAsn> listAsn, List<ListPrefix> listPrefixes) {
        super();
        this.status = status;
        this.statusMessage = statusMessage;
        this.orgName = orgName;
        this.continentCode = continentCode;
        this.continentName = continentName;
        this.countryName = countryName;
        this.domain = domain;
        this.numRanges = numRanges;
        this.numIpv4 = numIpv4;
        this.numIpv6 = numIpv6;
        this.numAsn = numAsn;
        this.listAsn = listAsn;
        this.listPrefixes = listPrefixes;
    }

    public String getStatus() {
        return status;
    }

    

    public String getStatusMessage() {
        return statusMessage;
    }

    

    public String getOrgName() {
        return orgName;
    }

    

    public String getContinentCode() {
        return continentCode;
    }

    

    public String getContinentName() {
        return continentName;
    }

    

    public String getCountryName() {
        return countryName;
    }

    

    public String getDomain() {
        return domain;
    }

    

    public String getNumRanges() {
        return numRanges;
    }

    

    public String getNumIpv4() {
        return numIpv4;
    }

    

    public String getNumIpv6() {
        return numIpv6;
    }

    

    public long getNumAsn() {
        return numAsn;
    }

    

    public List<ListAsn> getListAsn() {
        return listAsn;
    }

    

    public List<ListPrefix> getListPrefixes() {
        return listPrefixes;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("statusMessage", statusMessage).append("orgName", orgName).append("continentCode", continentCode).append("continentName", continentName).append("countryName", countryName).append("domain", domain).append("numRanges", numRanges).append("numIpv4", numIpv4).append("numIpv6", numIpv6).append("numAsn", numAsn).append("listAsn", listAsn).append("listPrefixes", listPrefixes).append("additionalProperties", additionalProperties).toString();
    }

}
