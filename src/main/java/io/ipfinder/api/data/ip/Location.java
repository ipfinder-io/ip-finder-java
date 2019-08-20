/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Location {

    private String capital;
    private String countryFlag;
    private String flagPng;
    private String countryFlagEmoji;
    private String countryFlagEmojiUnicode;
    private String callingCode;
    private String toplevelDomain;
    private String alpha3Code;
    private String population;
    private boolean isEu;
    private boolean isAr;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

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
        super();
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

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("capital", capital).append("countryFlag", countryFlag).append("flagPng", flagPng).append("countryFlagEmoji", countryFlagEmoji).append("countryFlagEmojiUnicode", countryFlagEmojiUnicode).append("callingCode", callingCode).append("toplevelDomain", toplevelDomain).append("alpha3Code", alpha3Code).append("population", population).append("isEu", isEu).append("isAr", isAr).append("additionalProperties", additionalProperties).toString();
    }

}
