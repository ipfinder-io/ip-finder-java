/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */

package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DomainResponse {

private String status;
private String statusMessage;
private String ip;
private String domain;
private boolean domainStatus;
private String continentCode;
private String continentName;
private String countryCode;
private String countryName;
private String countryNativeName;
private String regionName;
private String city;
private String latitude;
private String longitude;
private String asn;
private String organization;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public DomainResponse() {
}

/**
*
* @param countryName
* @param status
* @param countryNativeName
* @param countryCode
* @param regionName
* @param statusMessage
* @param ip
* @param city
* @param continentName
* @param organization
* @param continentCode
* @param domain
* @param asn
* @param longitude
* @param latitude
* @param domainStatus
*/
public DomainResponse(String status, String statusMessage, String ip, String domain, boolean domainStatus, String continentCode, String continentName, String countryCode, String countryName, String countryNativeName, String regionName, String city, String latitude, String longitude, String asn, String organization) {
super();
this.status = status;
this.statusMessage = statusMessage;
this.ip = ip;
this.domain = domain;
this.domainStatus = domainStatus;
this.continentCode = continentCode;
this.continentName = continentName;
this.countryCode = countryCode;
this.countryName = countryName;
this.countryNativeName = countryNativeName;
this.regionName = regionName;
this.city = city;
this.latitude = latitude;
this.longitude = longitude;
this.asn = asn;
this.organization = organization;
}

public String getStatus() {
return status;
}



public String getStatusMessage() {
return statusMessage;
}



public String getIp() {
return ip;
}



public String getDomain() {
return domain;
}



public boolean isDomainStatus() {
return domainStatus;
}



public String getContinentCode() {
return continentCode;
}



public String getContinentName() {
return continentName;
}



public String getCountryCode() {
return countryCode;
}



public String getCountryName() {
return countryName;
}



public String getCountryNativeName() {
return countryNativeName;
}



public String getRegionName() {
return regionName;
}



public String getCity() {
return city;
}



public String getLatitude() {
return latitude;
}



public String getLongitude() {
return longitude;
}



public String getAsn() {
return asn;
}



public String getOrganization() {
return organization;
}



public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}



@Override
public String toString() {
return new ToStringBuilder(this).append("status", status).append("statusMessage", statusMessage).append("ip", ip).append("domain", domain).append("domainStatus", domainStatus).append("continentCode", continentCode).append("continentName", continentName).append("countryCode", countryCode).append("countryName", countryName).append("countryNativeName", countryNativeName).append("regionName", regionName).append("city", city).append("latitude", latitude).append("longitude", longitude).append("asn", asn).append("organization", organization).append("additionalProperties", additionalProperties).toString();
}

}
