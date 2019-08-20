/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */

package io.ipfinder.api.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DomainResponse {

	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("status_message")
	@Expose
	private String statusMessage;
	@SerializedName("ip")
	@Expose
	private String ip;
	@SerializedName("domain")
	@Expose
	private String domain;
	@SerializedName("domain_status")
	@Expose
	private boolean domainStatus;
	@SerializedName("continent_code")
	@Expose
	private String continentCode;
	@SerializedName("continent_name")
	@Expose
	private String continentName;
	@SerializedName("country_code")
	@Expose
	private String countryCode;
	@SerializedName("country_name")
	@Expose
	private String countryName;
	@SerializedName("country_native_name")
	@Expose
	private String countryNativeName;
	@SerializedName("region_name")
	@Expose
	private String regionName;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("latitude")
	@Expose
	private String latitude;
	@SerializedName("longitude")
	@Expose
	private String longitude;
	@SerializedName("asn")
	@Expose
	private String asn;
	@SerializedName("organization")
	@Expose
	private String organization;

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
	public DomainResponse(String status, String statusMessage, String ip, String domain, boolean domainStatus,
			String continentCode, String continentName, String countryCode, String countryName,
			String countryNativeName, String regionName, String city, String latitude, String longitude, String asn,
			String organization) {
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

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("status", status).append("statusMessage", statusMessage)
				.append("ip", ip).append("domain", domain).append("domainStatus", domainStatus)
				.append("continentCode", continentCode).append("continentName", continentName)
				.append("countryCode", countryCode).append("countryName", countryName)
				.append("countryNativeName", countryNativeName).append("regionName", regionName).append("city", city)
				.append("latitude", latitude).append("longitude", longitude).append("asn", asn)
				.append("organization", organization).toString();
	}

}
