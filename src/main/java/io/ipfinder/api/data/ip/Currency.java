/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Currency {

    private String name;
    private String symbol;
    private String symbolNative;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Currency() {
    }

    /**
     * 
     * @param symbolNative
     * @param symbol
     * @param name
     */
    public Currency(String name, String symbol, String symbolNative) {
        super();
        this.name = name;
        this.symbol = symbol;
        this.symbolNative = symbolNative;
    }

    public String getName() {
        return name;
    }

    

    public String getSymbol() {
        return symbol;
    }

    

    public String getSymbolNative() {
        return symbolNative;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("symbol", symbol).append("symbolNative", symbolNative).append("additionalProperties", additionalProperties).toString();
    }

}
