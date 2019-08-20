/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.range;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListPrefix {

    @SerializedName("asn")
    @Expose
    private String asn;
    @SerializedName("prefix")
    @Expose
    private String prefix;



    /**
     * 
     * @param prefix
     * @param asn
     */
    public ListPrefix(String asn, String prefix) {
        this.asn = asn;
        this.prefix = prefix;
    }

    public String getAsn() {
        return asn;
    }

    

    public String getPrefix() {
        return prefix;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("asn", asn).append("prefix", prefix).toString();
    }

}
