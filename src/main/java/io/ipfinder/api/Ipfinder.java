/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api;

import io.ipfinder.api.exception.IPfinderException;
// import io.ipfinder.apinfo;
import io.ipfinder.api.validation.Asnvalidation;
import io.ipfinder.api.validation.Ipvalidation;
//import io.ipfinder.api.validation.Tokenvalidation;
import io.ipfinder.api.validation.Firewallvalidation;
import io.ipfinder.api.validation.Domainvalidation;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// import java.io.UnsupportedEncodingException;
// import java.net.URLEncoder;
/**
 * Using Apache HttpComponents HttpClient.
 * 
 *@see https://square.github.io/okhttp/4.x/okhttp/okhttp3/
 */
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.*;


/**
 * Main class.
 *
 * @version 1.0.0
 */
public class Ipfinder {

    /**
     * DEFAULT BASE URL
     */
    final String DEFAULT_BASE_URL  = "https://api.ipfinder.io/v1/";

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
    final String DOMAIN_PATH      = "domain/";

    /**
     * Get Domain IP history path
     */
    final String DOMAIN_H_PATH      = "domainhistory/";

    /**
     * Domain By ASN, Country,Ranges path
     */
    final String DOMAIN_BY_PATH      = "domainby/";



    public String token;

    public String baseUrl;

    public String format;
  /**
   * Constructor
   * 
   * @param  token   your token
   * @param  baseUrl proxy pass
   * @throws IPfinderException
   */
  
  public Ipfinder(String token , String baseUrl)  {

     
     if (token.isEmpty()) {
       this.token = DEFAULT_API_TOKEN;
     } else {
    //  new Tokenvalidation().validate(token);
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

  public void call(String path,String format) throws IPfinderException  {

      OkHttpClient client = new OkHttpClient();


      RequestBody requestBody = new MultipartBody.Builder()
              .setType(MultipartBody.FORM)
              .addFormDataPart("token", this.token)
              .addFormDataPart("format", format)
              .build();

      Request request = new Request.Builder()
              .url(DEFAULT_BASE_URL + path)
              .post(requestBody)
              .build();

      try {
          Response response = client.newCall(request).execute();

          System.out.println(response.body().string());
          // Do something with the response.
      } catch (IOException e) {
        
        throw new IPfinderException("Unexpected code " + e);
      }

  }

  /**
   * Get details for an Your IP address.
   * 
   */
  public void authentication() throws  IPfinderException{

    call("","json");

  }

  /**
   * Get details for an IP address.
   * 
   * @param path   IP address.
   * @throws IPfinderException
   */
  public void getAddressInfo(String path) throws IPfinderException {
    
    new Ipvalidation().validate(path);
    call(path,"json");

  }

  /**
   * Get details for an AS number.
   * 
   * @param path  AS number.
   * @throws IPfinderException
   */
  public void getAsn(String path) throws IPfinderException {
    
    new Asnvalidation().validate(path);
    call(path,"json");

  }

  /**
   * Get details for an API Token .
   * 
   */
  public void getStatus() throws IPfinderException {
     call(STATUS_PATH + "","json");
  }

  /**
   * Get details for an Organization name.
   * 
   * @param path path Organization name.
   */
  public void getRanges(String path) throws UnsupportedEncodingException,IPfinderException {
    String encoded = URLEncoder.encode("path", "utf-8");
    call(RANGES_PATH + encoded,"json");

  }

  /**
   * Get Firewall data
   * 
   * @param path     AS number, alpha-2 country only.
   * @param formats formats list formats supported
   * @throws IPfinderException
   * @see IPfinderException throws IPfinderException
   */
  public void getFirewall(String path,String formats) throws IPfinderException   {
    
    new Firewallvalidation().validate(path,formats);
    call(FIREWALL_PATH + path,formats);
 
  }

  /**
   * Get Domain IP
   * 
   * @param path  The API supports passing in a single website name domain name
   * @throws IPfinderException
   */
  public void getDomain(String path) throws IPfinderException  {
    
    new Domainvalidation().validate(path);
    call(DOMAIN_PATH + path,"json");

  }

  /**
   * Get Domain History
   * 
   * @param path The API supports passing in a single website name domain name
   * @throws IPfinderException
   */
  public void getDomainHistory(String path) throws IPfinderException {
    
    new Domainvalidation().validate(path);
    call(DOMAIN_H_PATH + path,"json");

  }

  /**
   * Get list Domain By ASN, Country,Ranges
   * 
   * @param by The API supports passing in a single ASN,Country,Ranges
   */
  public void getDomainBy(String by) throws IPfinderException {
    
     call(DOMAIN_BY_PATH +by,"json");

  }



  public static void main(String[] args)   {

//      Ipfinder ipfinder = new Ipfinder("f67f788f8a02a188ec84502e0dff066ed4413a85", "");
//
//      try {
//          
//          String ip = "5.0.0.2";
//          ipfinder.getAddressInfo(ip);
//      } catch (IPfinderException ex) {
//          // Handle error
//          System.out.println(ex);
//      }

  }
}
