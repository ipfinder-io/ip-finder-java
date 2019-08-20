/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.range;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListAsn {

    @SerializedName("asn")
    @Expose
    private String asn;
    @SerializedName("OrgId")
    @Expose
    private String orgId;
    @SerializedName("Total_prefix")
    @Expose
    private String totalPrefix;
    @SerializedName("Total_v4")
    @Expose
    private String totalV4;
    @SerializedName("Total_v6")
    @Expose
    private String totalV6;



    /**
     * 
     * @param orgId
     * @param totalPrefix
     * @param asn
     * @param totalV6
     * @param totalV4
     */
    public ListAsn(String asn, String orgId, String totalPrefix, String totalV4, String totalV6) {
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

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("asn", asn).append("orgId", orgId).append("totalPrefix", totalPrefix).append("totalV4", totalV4).append("totalV6", totalV6).toString();
    }

}
