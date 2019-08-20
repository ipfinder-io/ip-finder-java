/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.ip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Location {

@SerializedName("capital")
@Expose
private String capital;
@SerializedName("country_flag")
@Expose
private String countryFlag;
@SerializedName("flag_png")
@Expose
private String flagPng;
@SerializedName("country_flag_emoji")
@Expose
private String countryFlagEmoji;
@SerializedName("country_flag_emoji_unicode")
@Expose
private String countryFlagEmojiUnicode;
@SerializedName("calling_code")
@Expose
private String callingCode;
@SerializedName("toplevel_domain")
@Expose
private String toplevelDomain;
@SerializedName("alpha3_code")
@Expose
private String alpha3Code;
@SerializedName("population")
@Expose
private String population;
@SerializedName("is_eu")
@Expose
private boolean isEu;
@SerializedName("is_ar")
@Expose
private boolean isAr;



/**
*
* @param isAr
* @param callingCode
* @param countryFlag
* @param alpha3Code
* @param countryFlagEmoji
* @param toplevelDomain
* @param isEu
* @param flagPng
* @param capital
* @param countryFlagEmojiUnicode
* @param population
*/
public Location(String capital, String countryFlag, String flagPng, String countryFlagEmoji, String countryFlagEmojiUnicode, String callingCode, String toplevelDomain, String alpha3Code, String population, boolean isEu, boolean isAr) {
this.capital = capital;
this.countryFlag = countryFlag;
this.flagPng = flagPng;
this.countryFlagEmoji = countryFlagEmoji;
this.countryFlagEmojiUnicode = countryFlagEmojiUnicode;
this.callingCode = callingCode;
this.toplevelDomain = toplevelDomain;
this.alpha3Code = alpha3Code;
this.population = population;
this.isEu = isEu;
this.isAr = isAr;
}

public String getCapital() {
return capital;
}



public String getCountryFlag() {
return countryFlag;
}



public String getFlagPng() {
return flagPng;
}



public String getCountryFlagEmoji() {
return countryFlagEmoji;
}



public String getCountryFlagEmojiUnicode() {
return countryFlagEmojiUnicode;
}



public String getCallingCode() {
return callingCode;
}



public String getToplevelDomain() {
return toplevelDomain;
}



public String getAlpha3Code() {
return alpha3Code;
}



public String getPopulation() {
return population;
}



public boolean isIsEu() {
return isEu;
}



public boolean isIsAr() {
return isAr;
}



@Override
public String toString() {
return new ToStringBuilder(this).append("capital", capital).append("countryFlag", countryFlag).append("flagPng", flagPng).append("countryFlagEmoji", countryFlagEmoji).append("countryFlagEmojiUnicode", countryFlagEmojiUnicode).append("callingCode", callingCode).append("toplevelDomain", toplevelDomain).append("alpha3Code", alpha3Code).append("population", population).append("isEu", isEu).append("isAr", isAr).toString();
}

}
