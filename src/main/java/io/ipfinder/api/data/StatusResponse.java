/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */

package io.ipfinder.api.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class StatusResponse {

	@SerializedName("apiKey")
	@Expose
	private String apiKey;
	@SerializedName("queriesPerDay")
	@Expose
	private long queriesPerDay;
	@SerializedName("queriesLeft")
	@Expose
	private long queriesLeft;
	@SerializedName("asqueriesPerDay")
	@Expose
	private long asqueriesPerDay;
	@SerializedName("asqueriesLeft")
	@Expose
	private long asqueriesLeft;
	@SerializedName("key_type")
	@Expose
	private String keyType;
	@SerializedName("key_info")
	@Expose
	private String keyInfo;
	@SerializedName("status")
	@Expose
	private String status;

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
	public StatusResponse(String apiKey, long queriesPerDay, long queriesLeft, long asqueriesPerDay, long asqueriesLeft,
			String keyType, String keyInfo, String status) {
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

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("apiKey", apiKey).append("queriesPerDay", queriesPerDay)
				.append("queriesLeft", queriesLeft).append("asqueriesPerDay", asqueriesPerDay)
				.append("asqueriesLeft", asqueriesLeft).append("keyType", keyType).append("keyInfo", keyInfo)
				.append("status", status).toString();
	}

}
