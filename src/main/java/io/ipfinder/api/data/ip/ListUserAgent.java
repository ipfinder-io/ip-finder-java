/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.ip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListUserAgent {

@SerializedName("user_agent")
@Expose
private String userAgent;
@SerializedName("browser_name")
@Expose
private String browserName;
@SerializedName("os_name")
@Expose
private String osName;
@SerializedName("device_type")
@Expose
private String deviceType;



/**
*
* @param browserName
* @param userAgent
* @param deviceType
* @param osName
*/
public ListUserAgent(String userAgent, String browserName, String osName, String deviceType) {
this.userAgent = userAgent;
this.browserName = browserName;
this.osName = osName;
this.deviceType = deviceType;
}

public String getUserAgent() {
return userAgent;
}



public String getBrowserName() {
return browserName;
}



public String getOsName() {
return osName;
}



public String getDeviceType() {
return deviceType;
}



@Override
public String toString() {
return new ToStringBuilder(this).append("userAgent", userAgent).append("browserName", browserName).append("osName", osName).append("deviceType", deviceType).toString();
}

}
