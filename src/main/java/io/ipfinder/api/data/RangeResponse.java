/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */

package io.ipfinder.api.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;
import io.ipfinder.api.data.range.*;

public class RangeResponse {

	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("status_message")
	@Expose
	private String statusMessage;
	@SerializedName("org_name")
	@Expose
	private String orgName;
	@SerializedName("continent_code")
	@Expose
	private String continentCode;
	@SerializedName("continent_name")
	@Expose
	private String continentName;
	@SerializedName("country_name")
	@Expose
	private String countryName;
	@SerializedName("domain")
	@Expose
	private String domain;
	@SerializedName("num_ranges")
	@Expose
	private String numRanges;
	@SerializedName("num_ipv4")
	@Expose
	private String numIpv4;
	@SerializedName("num_ipv6")
	@Expose
	private String numIpv6;
	@SerializedName("num_asn")
	@Expose
	private long numAsn;
	@SerializedName("list_asn")
	@Expose
	private List<ListAsn> listAsn = null;
	@SerializedName("list_prefixes")
	@Expose
	private List<ListPrefix> listPrefixes = null;

	/**
	 * 
	 * @param countryName
	 * @param status
	 * @param listPrefixes
	 * @param orgName
	 * @param statusMessage
	 * @param numAsn
	 * @param numIpv4
	 * @param continentName
	 * @param numIpv6
	 * @param continentCode
	 * @param domain
	 * @param numRanges
	 * @param listAsn
	 */
	public RangeResponse(String status, String statusMessage, String orgName, String continentCode,
			String continentName, String countryName, String domain, String numRanges, String numIpv4, String numIpv6,
			long numAsn, List<ListAsn> listAsn, List<ListPrefix> listPrefixes) {
		this.status = status;
		this.statusMessage = statusMessage;
		this.orgName = orgName;
		this.continentCode = continentCode;
		this.continentName = continentName;
		this.countryName = countryName;
		this.domain = domain;
		this.numRanges = numRanges;
		this.numIpv4 = numIpv4;
		this.numIpv6 = numIpv6;
		this.numAsn = numAsn;
		this.listAsn = listAsn;
		this.listPrefixes = listPrefixes;
	}

	public String getStatus() {
		return status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public String getOrgName() {
		return orgName;
	}

	public String getContinentCode() {
		return continentCode;
	}

	public String getContinentName() {
		return continentName;
	}

	public String getCountryName() {
		return countryName;
	}

	public String getDomain() {
		return domain;
	}

	public String getNumRanges() {
		return numRanges;
	}

	public String getNumIpv4() {
		return numIpv4;
	}

	public String getNumIpv6() {
		return numIpv6;
	}

	public long getNumAsn() {
		return numAsn;
	}

	public List<ListAsn> getListAsn() {
		return listAsn;
	}

	public List<ListPrefix> getListPrefixes() {
		return listPrefixes;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("status", status).append("statusMessage", statusMessage)
				.append("orgName", orgName).append("continentCode", continentCode)
				.append("continentName", continentName).append("countryName", countryName).append("domain", domain)
				.append("numRanges", numRanges).append("numIpv4", numIpv4).append("numIpv6", numIpv6)
				.append("numAsn", numAsn).append("listAsn", listAsn).append("listPrefixes", listPrefixes).toString();
	}

}
