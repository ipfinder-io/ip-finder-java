/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.validation;
import io.ipfinder.api.exception.IPfinderException;

/**
 * 
 */
public class Tokenvalidation {

  /**
   * Helper method for validating IPFINDER API TOKEN
   * 
   * @param token  Your API key 
   * @throws IPfinderException
   */
  public void validate(String token) throws IPfinderException {

      if (token.length() <= 25) {
         throw new IPfinderException("Invalid IPFINDER API Token");
      }

  }

  // public static void main(String[] args)   {

  //   try{

  //       Tokenvalidation ipfinder = new Tokenvalidation();

  //       ipfinder.validate("aasdasdasdaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
  //   }catch (IPfinderException e) {
  //        System.out.println(e);
  //   }

  // }
}
