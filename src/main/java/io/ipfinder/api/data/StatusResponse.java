/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */

package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StatusResponse {

private String apiKey;
private long queriesPerDay;
private long queriesLeft;
private long asqueriesPerDay;
private long asqueriesLeft;
private String keyType;
private String keyInfo;
private String status;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public StatusResponse() {
}

/**
*
* @param keyType
* @param status
* @param asqueriesPerDay
* @param queriesLeft
* @param keyInfo
* @param asqueriesLeft
* @param queriesPerDay
* @param apiKey
*/
public StatusResponse(String apiKey, long queriesPerDay, long queriesLeft, long asqueriesPerDay, long asqueriesLeft, String keyType, String keyInfo, String status) {
super();
this.apiKey = apiKey;
this.queriesPerDay = queriesPerDay;
this.queriesLeft = queriesLeft;
this.asqueriesPerDay = asqueriesPerDay;
this.asqueriesLeft = asqueriesLeft;
this.keyType = keyType;
this.keyInfo = keyInfo;
this.status = status;
}

public String getApiKey() {
return apiKey;
}



public long getQueriesPerDay() {
return queriesPerDay;
}



public long getQueriesLeft() {
return queriesLeft;
}



public long getAsqueriesPerDay() {
return asqueriesPerDay;
}



public long getAsqueriesLeft() {
return asqueriesLeft;
}



public String getKeyType() {
return keyType;
}



public String getKeyInfo() {
return keyInfo;
}



public String getStatus() {
return status;
}



public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}



@Override
public String toString() {
return new ToStringBuilder(this).append("apiKey", apiKey).append("queriesPerDay", queriesPerDay).append("queriesLeft", queriesLeft).append("asqueriesPerDay", asqueriesPerDay).append("asqueriesLeft", asqueriesLeft).append("keyType", keyType).append("keyInfo", keyInfo).append("status", status).append("additionalProperties", additionalProperties).toString();
}

}
