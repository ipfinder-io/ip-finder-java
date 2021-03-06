/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */

package io.ipfinder.api.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;
import io.ipfinder.api.data.domainh.*;

public class DomainHtResponse {

	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("status_message")
	@Expose
	private String statusMessage;
	@SerializedName("total_domain")
	@Expose
	private long totalDomain;
	@SerializedName("list_domain")
	@Expose
	private List<List<ListDomain>> listDomain = null;

	/**
	 * 
	 * @param listDomain
	 * @param status
	 * @param totalDomain
	 * @param statusMessage
	 */
	public DomainHtResponse(String status, String statusMessage, long totalDomain, List<List<ListDomain>> listDomain) {
		this.status = status;
		this.statusMessage = statusMessage;
		this.totalDomain = totalDomain;
		this.listDomain = listDomain;
	}

	public String getStatus() {
		return status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public long getTotalDomain() {
		return totalDomain;
	}

	public List<List<ListDomain>> getListDomain() {
		return listDomain;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("status", status).append("statusMessage", statusMessage)
				.append("totalDomain", totalDomain).append("listDomain", listDomain).toString();
	}

}
