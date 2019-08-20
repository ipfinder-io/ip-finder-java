/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.asn;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Speed {

    @SerializedName("ping")
    @Expose
    private String ping;
    @SerializedName("download")
    @Expose
    private String download;
    @SerializedName("upload")
    @Expose
    private String upload;



    /**
     * 
     * @param download
     * @param upload
     * @param ping
     */
    public Speed(String ping, String download, String upload) {
        this.ping = ping;
        this.download = download;
        this.upload = upload;
    }

    public String getPing() {
        return ping;
    }

    

    public String getDownload() {
        return download;
    }

    

    public String getUpload() {
        return upload;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ping", ping).append("download", download).append("upload", upload).toString();
    }

}
