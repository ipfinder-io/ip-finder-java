/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.domainby;

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



    /**
     * 
     * @param organization
     * @param address
     * @param asn
     * @param domainName
     * @param country
     */
    public ListDomain(String domainName, String address, String country, String asn, String organization) {
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

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("domainName", domainName).append("address", address).append("country", country).append("asn", asn).append("organization", organization).toString();
    }

}
