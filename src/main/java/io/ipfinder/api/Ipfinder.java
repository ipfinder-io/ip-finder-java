/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api;

import io.ipfinder.api.exception.IPfinderException;
import io.ipfinder.api.validation.Asnvalidation;
import io.ipfinder.api.validation.Ipvalidation;
//import io.ipfinder.api.validation.Tokenvalidation;
import io.ipfinder.api.validation.Firewallvalidation;
import io.ipfinder.api.validation.Domainvalidation;
import io.ipfinder.api.data.DomainByResponse;
import io.ipfinder.api.data.AsnResponse;
import io.ipfinder.api.data.DomainHtResponse;
import io.ipfinder.api.data.DomainResponse;
import io.ipfinder.api.data.IPResponse;
import io.ipfinder.api.data.StatusResponse;
import io.ipfinder.api.data.RangeResponse;
//import io.ipfinder.api.data.FirewallResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Using okhttp
 *  
 *@see https://square.github.io/okhttp/4.x/okhttp/okhttp3/
 */
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.*;
import com.google.gson.Gson;

/**
 * Main class.
 *
 * @version 1.0.0
 */
public class Ipfinder {

	/**
	 * DEFAULT BASE URL
	 */
	final String DEFAULT_BASE_URL = "https://api.ipfinder.io/v1/";

	/**
	 * The free token limited to 4,000 requests a day
	 */
	final String DEFAULT_API_TOKEN = "free";

	/**
	 * DEFAULT FORMAT
	 */
	final String FORMAT = "json";

	/**
	 * service status path
	 */
	final String STATUS_PATH = "info";

	/**
	 * IP Address Ranges path
	 */
	final String RANGES_PATH = "ranges/";

	/**
	 * Firewall path
	 */
	final String FIREWALL_PATH = "firewall/";

	/**
	 * Get Domain IP path
	 */
	final String DOMAIN_PATH = "domain/";

	/**
	 * Get Domain IP history path
	 */
	final String DOMAIN_H_PATH = "domainhistory/";

	/**
	 * Domain By ASN, Country,Ranges path
	 */
	final String DOMAIN_BY_PATH = "domainby/";

	/**
	 * Gson
	 */
	protected final static Gson gson = new Gson();

	public String token;

	public String baseUrl;

	public String format;


	/**
	 * Constructor
	 * 
	 * @param token   your token
	 * @param baseUrl proxy pass
	 * @throws IPfinderException
	 */

	public Ipfinder(String token, String baseUrl) {

		if (token.isEmpty()) {
			this.token = DEFAULT_API_TOKEN;
		} else {
		 // new Tokenvalidation().validate(token);
			this.token = token;
		}

		if (baseUrl.isEmpty()) {
			this.baseUrl = DEFAULT_BASE_URL;
		} else {
			this.baseUrl = baseUrl;
		}

		// this.baseUrl = baseUrl;
	}

	/**
	 * Call
	 * 
	 * @param path   specific path of asn, IP address, ranges, Firewall,Token status
	 * @param format available format `json` `jsonp` `php` `xml`
	 * @throws IPfinderException, IOException
	 */

	public String call(String path, String format) throws IPfinderException {

		OkHttpClient client = new OkHttpClient();

		RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM)
				.addFormDataPart("token", this.token).addFormDataPart("format", format).build();

		Request request = new Request.Builder().url(DEFAULT_BASE_URL + path).post(requestBody).build();

		Response response;

		try {
			response = client.newCall(request).execute();

			return response.body().string();

		} catch (IOException e) {

			throw new IPfinderException("Unexpected code " + e);
		}

	}

	/**
	 * Get details for an Your IP address.
	 * 
	 */
	public IPResponse authentication() throws IPfinderException {

		return gson.fromJson(call("", "json"), IPResponse.class);

	}

	/**
	 * Get details for an IP address.
	 * 
	 * @param path IP address.
	 * @return
	 * @throws IPfinderException
	 */
	public IPResponse getAddressInfo(String path) throws IPfinderException {

		new Ipvalidation().validate(path);

		return gson.fromJson(call(path, "json"), IPResponse.class);
	}

	/**
	 * Get details for an AS number.
	 * 
	 * @param path AS number.
	 * @throws IPfinderException
	 */
	public AsnResponse getAsn(String path) throws IPfinderException {

		new Asnvalidation().validate(path);

		return gson.fromJson(call(path, "json"), AsnResponse.class);

	}

	/**
	 * Get details for an API Token .
	 * 
	 */
	public StatusResponse getStatus() throws IPfinderException {

		return gson.fromJson(call(STATUS_PATH + "", "json"), StatusResponse.class);
	}

	/**
	 * Get details for an Organization name.
	 * 
	 * @param path path Organization name.
	 */
	public RangeResponse getRanges(String path) throws UnsupportedEncodingException, IPfinderException {
		String encoded = URLEncoder.encode("path", "utf-8");
		return gson.fromJson(call(RANGES_PATH + encoded, "json"), RangeResponse.class);
	}

	/**
	 * Get Firewall data
	 * 
	 * @param path    AS number, alpha-2 country only.
	 * @param formats formats list formats supported
	 * @throws IPfinderException
	 * @see IPfinderException throws IPfinderException
	 */
	public String getFirewall(String path, String formats) throws IPfinderException {

		new Firewallvalidation().validate(path, formats);
		return call(FIREWALL_PATH + path, formats);

	}

	/**
	 * Get Domain IP
	 * 
	 * @param path The API supports passing in a single website name domain name
	 * @throws IPfinderException
	 */
	public DomainResponse getDomain(String path) throws IPfinderException {

		new Domainvalidation().validate(path);
		return gson.fromJson(call(DOMAIN_PATH + path, "json"), DomainResponse.class);

	}

	/**
	 * Get Domain History
	 * 
	 * @param path The API supports passing in a single website name domain name
	 * @throws IPfinderException
	 */
	public DomainHtResponse getDomainHistory(String path) throws IPfinderException {

		new Domainvalidation().validate(path);
		return gson.fromJson(call(DOMAIN_H_PATH + path, "json"), DomainHtResponse.class);

	}

	/**
	 * Get list Domain By ASN, Country,Ranges
	 * 
	 * @param by The API supports passing in a single ASN,Country,Ranges
	 */
	public DomainByResponse getDomainBy(String by) throws IPfinderException {

		return gson.fromJson(call(DOMAIN_BY_PATH + by, "json"), DomainByResponse.class);

	}

	public static void main(String[] args) {



	}
}
