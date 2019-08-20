/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.asn;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Speed {

    private String ping;
    private String download;
    private String upload;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Speed() {
    }

    /**
     * 
     * @param download
     * @param upload
     * @param ping
     */
    public Speed(String ping, String download, String upload) {
        super();
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

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ping", ping).append("download", download).append("upload", upload).append("additionalProperties", additionalProperties).toString();
    }

}
