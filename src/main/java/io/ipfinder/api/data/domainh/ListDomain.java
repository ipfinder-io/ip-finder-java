/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.domainh;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListDomain {

    @SerializedName("domain_name")
    @Expose
    private String domainName;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("asn")
    @Expose
    private String asn;
    @SerializedName("organization")
    @Expose
    private String organization;
    @SerializedName("last_seen_on")
    @Expose
    private String lastSeenOn;



    /**
     * 
     * @param organization
     * @param address
     * @param lastSeenOn
     * @param asn
     * @param domainName
     * @param country
     */
    public ListDomain(String domainName, String address, String country, String asn, String organization, String lastSeenOn) {
        this.domainName = domainName;
        this.address = address;
        this.country = country;
        this.asn = asn;
        this.organization = organization;
        this.lastSeenOn = lastSeenOn;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAsn() {
        return asn;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getLastSeenOn() {
        return lastSeenOn;
    }

    public void setLastSeenOn(String lastSeenOn) {
        this.lastSeenOn = lastSeenOn;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("domainName", domainName).append("address", address).append("country", country).append("asn", asn).append("organization", organization).append("lastSeenOn", lastSeenOn).toString();
    }

}
