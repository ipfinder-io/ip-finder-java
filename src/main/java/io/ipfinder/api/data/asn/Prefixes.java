/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.asn;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Prefixes {

    @SerializedName("total_prefixes")
    @Expose
    private long totalPrefixes;
    @SerializedName("list_prefixes")
    @Expose
    private List<String> listPrefixes = null;



    /**
     * 
     * @param listPrefixes
     * @param totalPrefixes
     */
    public Prefixes(long totalPrefixes, List<String> listPrefixes) {
        this.totalPrefixes = totalPrefixes;
        this.listPrefixes = listPrefixes;
    }

    public long getTotalPrefixes() {
        return totalPrefixes;
    }

    

    public List<String> getListPrefixes() {
        return listPrefixes;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalPrefixes", totalPrefixes).append("listPrefixes", listPrefixes).toString();
    }

}
