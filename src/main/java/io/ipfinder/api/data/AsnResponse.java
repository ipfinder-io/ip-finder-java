/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */

package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;
import io.ipfinder.api.data.asn.*;

public class AsnResponse {

    private String status;
    private String statusMessage;
    private String asn;
    private String orgName;
    private String continentCode;
    private String continentName;
    private String countryCode;
    private String countryName;
    private String allocated;
    private String registry;
    private String domain;
    private String numIpsIpv4;
    private String numIpsIpv6;
    private String asName;
    private String orgId;
    private String comanyType;
    private Speed speed;
    private Peers peers;
    private Upstreams upstreams;
    private Downstreams downstreams;
    private Prefixes prefixes;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AsnResponse() {
    }

    /**
     * 
     * @param countryName
     * @param speed
     * @param status
     * @param countryCode
     * @param allocated
     * @param comanyType
     * @param numIpsIpv6
     * @param orgName
     * @param prefixes
     * @param numIpsIpv4
     * @param downstreams
     * @param statusMessage
     * @param orgId
     * @param continentName
     * @param continentCode
     * @param peers
     * @param domain
     * @param asn
     * @param upstreams
     * @param asName
     * @param registry
     */
    public AsnResponse(String status, String statusMessage, String asn, String orgName, String continentCode, String continentName, String countryCode, String countryName, String allocated, String registry, String domain, String numIpsIpv4, String numIpsIpv6, String asName, String orgId, String comanyType, Speed speed, Peers peers, Upstreams upstreams, Downstreams downstreams, Prefixes prefixes) {
        super();
        this.status = status;
        this.statusMessage = statusMessage;
        this.asn = asn;
        this.orgName = orgName;
        this.continentCode = continentCode;
        this.continentName = continentName;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.allocated = allocated;
        this.registry = registry;
        this.domain = domain;
        this.numIpsIpv4 = numIpsIpv4;
        this.numIpsIpv6 = numIpsIpv6;
        this.asName = asName;
        this.orgId = orgId;
        this.comanyType = comanyType;
        this.speed = speed;
        this.peers = peers;
        this.upstreams = upstreams;
        this.downstreams = downstreams;
        this.prefixes = prefixes;
    }

    public String getStatus() {
        return status;
    }

    

    public String getStatusMessage() {
        return statusMessage;
    }

    

    public String getAsn() {
        return asn;
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

    

    public String getCountryCode() {
        return countryCode;
    }

    

    public String getCountryName() {
        return countryName;
    }

    

    public String getAllocated() {
        return allocated;
    }

    

    public String getRegistry() {
        return registry;
    }

    

    public String getDomain() {
        return domain;
    }

    

    public String getNumIpsIpv4() {
        return numIpsIpv4;
    }

    

    public String getNumIpsIpv6() {
        return numIpsIpv6;
    }

    

    public String getAsName() {
        return asName;
    }

    

    public String getOrgId() {
        return orgId;
    }

    

    public String getComanyType() {
        return comanyType;
    }

    

    public Speed getSpeed() {
        return speed;
    }

    

    public Peers getPeers() {
        return peers;
    }

    

    public Upstreams getUpstreams() {
        return upstreams;
    }

    

    public Downstreams getDownstreams() {
        return downstreams;
    }

    

    public Prefixes getPrefixes() {
        return prefixes;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("statusMessage", statusMessage).append("asn", asn).append("orgName", orgName).append("continentCode", continentCode).append("continentName", continentName).append("countryCode", countryCode).append("countryName", countryName).append("allocated", allocated).append("registry", registry).append("domain", domain).append("numIpsIpv4", numIpsIpv4).append("numIpsIpv6", numIpsIpv6).append("asName", asName).append("orgId", orgId).append("comanyType", comanyType).append("speed", speed).append("peers", peers).append("upstreams", upstreams).append("downstreams", downstreams).append("prefixes", prefixes).append("additionalProperties", additionalProperties).toString();
    }

}
