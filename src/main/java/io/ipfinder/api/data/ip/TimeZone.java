/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.ip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class TimeZone {

@SerializedName("id")
@Expose
private String id;
@SerializedName("UTC")
@Expose
private String uTC;
@SerializedName("gmt_offset")
@Expose
private long gmtOffset;
@SerializedName("current_time")
@Expose
private String currentTime;



/**
*
* @param currentTime
* @param uTC
* @param id
* @param gmtOffset
*/
public TimeZone(String id, String uTC, long gmtOffset, String currentTime) {
this.id = id;
this.uTC = uTC;
this.gmtOffset = gmtOffset;
this.currentTime = currentTime;
}

public String getId() {
return id;
}



public String getUTC() {
return uTC;
}



public long getGmtOffset() {
return gmtOffset;
}



public String getCurrentTime() {
return currentTime;
}



@Override
public String toString() {
return new ToStringBuilder(this).append("id", id).append("uTC", uTC).append("gmtOffset", gmtOffset).append("currentTime", currentTime).toString();
}

}

