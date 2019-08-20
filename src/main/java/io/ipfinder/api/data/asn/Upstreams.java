/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.asn;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Upstreams {

    @SerializedName("total_upstreams")
    @Expose
    private long totalUpstreams;
    @SerializedName("list_upstreams")
    @Expose
    private List<String> listUpstreams = null;



    /**
     * 
     * @param totalUpstreams
     * @param listUpstreams
     */
    public Upstreams(long totalUpstreams, List<String> listUpstreams) {
        this.totalUpstreams = totalUpstreams;
        this.listUpstreams = listUpstreams;
    }

    public long getTotalUpstreams() {
        return totalUpstreams;
    }

    

    public List<String> getListUpstreams() {
        return listUpstreams;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalUpstreams", totalUpstreams).append("listUpstreams", listUpstreams).toString();
    }

}
