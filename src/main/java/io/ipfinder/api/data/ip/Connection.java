/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.ip;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Connection {

@SerializedName("asn")
@Expose
private String asn;
@SerializedName("organization")
@Expose
private String organization;
@SerializedName("domain")
@Expose
private String domain;
@SerializedName("type")
@Expose
private String type;



/**
*
* @param organization
* @param domain
* @param asn
* @param type
*/
public Connection(String asn, String organization, String domain, String type) {
this.asn = asn;
this.organization = organization;
this.domain = domain;
this.type = type;
}

public String getAsn() {
return asn;
}



public String getOrganization() {
return organization;
}



public String getDomain() {
return domain;
}



public String getType() {
return type;
}



@Override
public String toString() {
return new ToStringBuilder(this).append("asn", asn).append("organization", organization).append("domain", domain).append("type", type).toString();
}

}
