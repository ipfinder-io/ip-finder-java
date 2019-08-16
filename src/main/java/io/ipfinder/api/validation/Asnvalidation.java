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
public class Asnvalidation {

  /**
   * Helper method for validating an argument if it is asn number
   * 
   * @param asn The AS number you want details for
   * @throws IPfinderException
   */
  public void validate(String asn) throws IPfinderException {

  	String pattern = "^(as|AS)(\\d+)$";

  	Pattern r = Pattern.compile(pattern);

      Matcher m = r.matcher(asn);

      if (!m.find()) {
         throw new IPfinderException("Invalid Domain name");
      }
      

  }

}
