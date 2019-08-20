/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.asn;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Peers {

    @SerializedName("total_peers")
    @Expose
    private long totalPeers;
    @SerializedName("list_peers")
    @Expose
    private List<String> listPeers = null;


    /**
     * 
     * @param listPeers
     * @param totalPeers
     */
    public Peers(long totalPeers, List<String> listPeers) {
        this.totalPeers = totalPeers;
        this.listPeers = listPeers;
    }

    public long getTotalPeers() {
        return totalPeers;
    }

    

    public List<String> getListPeers() {
        return listPeers;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalPeers", totalPeers).append("listPeers", listPeers).toString();
    }

}
