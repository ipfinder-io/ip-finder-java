/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.asn;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Downstreams {

    @SerializedName("total_downstreams")
    @Expose
    private long totalDownstreams;
    @SerializedName("list_downstreams")
    @Expose
    private List<String> listDownstreams = null;


    /**
     * 
     * @param listDownstreams
     * @param totalDownstreams
     */
    public Downstreams(long totalDownstreams, List<String> listDownstreams) {
        this.totalDownstreams = totalDownstreams;
        this.listDownstreams = listDownstreams;
    }

    public long getTotalDownstreams() {
        return totalDownstreams;
    }

    

    public List<String> getListDownstreams() {
        return listDownstreams;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalDownstreams", totalDownstreams).append("listDownstreams", listDownstreams).toString();
    }

}
