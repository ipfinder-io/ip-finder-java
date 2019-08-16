/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.validation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import io.ipfinder.api.exception.IPfinderException;

/**
 * 
 */
public class Domainvalidation {

  /**
   * Helper method for validating domain name
   * 
   * @param domain passing in a single website name domain name
   * @throws IPfinderException
   */
  public void validate(String domain) throws IPfinderException {

  	String pattern = "^((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}$";

  	Pattern r = Pattern.compile(pattern);

      Matcher m = r.matcher(domain);

      if (!m.find()) {
         throw new IPfinderException("Invalid Domain name");
      }

  }


}
