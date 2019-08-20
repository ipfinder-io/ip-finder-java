/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.ip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Security {

@SerializedName("is_proxy")
@Expose
private boolean isProxy;
@SerializedName("proxy_type")
@Expose
private boolean proxyType;
@SerializedName("is_tor")
@Expose
private boolean isTor;
@SerializedName("is_spam")
@Expose
private boolean isSpam;
@SerializedName("threat_level")
@Expose
private String threatLevel;



/**
*
* @param proxyType
* @param isSpam
* @param isProxy
* @param threatLevel
* @param isTor
*/
public Security(boolean isProxy, boolean proxyType, boolean isTor, boolean isSpam, String threatLevel) {
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



@Override
public String toString() {
return new ToStringBuilder(this).append("isProxy", isProxy).append("proxyType", proxyType).append("isTor", isTor).append("isSpam", isSpam).append("threatLevel", threatLevel).toString();
}

}
