/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.domainby;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListDomain {

    private String domainName;
    private String address;
    private String country;
    private String asn;
    private String organization;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListDomain() {
    }

    /**
     * 
     * @param organization
     * @param address
     * @param asn
     * @param domainName
     * @param country
     */
    public ListDomain(String domainName, String address, String country, String asn, String organization) {
        super();
        this.domainName = domainName;
        this.address = address;
        this.country = country;
        this.asn = asn;
        this.organization = organization;
    }

    public String getDomainName() {
        return domainName;
    }

    

    public String getAddress() {
        return address;
    }

    

    public String getCountry() {
        return country;
    }

    

    public String getAsn() {
        return asn;
    }

    

    public String getOrganization() {
        return organization;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("domainName", domainName).append("address", address).append("country", country).append("asn", asn).append("organization", organization).append("additionalProperties", additionalProperties).toString();
    }

}
