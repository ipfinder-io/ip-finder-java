/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Security {

    private boolean isProxy;
    private boolean proxyType;
    private boolean isTor;
    private boolean isSpam;
    private String threatLevel;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Security() {
    }

    /**
     * 
     * @param proxyType
     * @param isSpam
     * @param isProxy
     * @param threatLevel
     * @param isTor
     */
    public Security(boolean isProxy, boolean proxyType, boolean isTor, boolean isSpam, String threatLevel) {
        super();
        this.isProxy = isProxy;
        this.proxyType = proxyType;
        this.isTor = isTor;
        this.isSpam = isSpam;
        this.threatLevel = threatLevel;
    }

    public boolean isIsProxy() {
        return isProxy;
    }

    

    public boolean isProxyType() {
        return proxyType;
    }

    

    public boolean isIsTor() {
        return isTor;
    }

    

    public boolean isIsSpam() {
        return isSpam;
    }

    

    public String getThreatLevel() {
        return threatLevel;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isProxy", isProxy).append("proxyType", proxyType).append("isTor", isTor).append("isSpam", isSpam).append("threatLevel", threatLevel).append("additionalProperties", additionalProperties).toString();
    }

}
