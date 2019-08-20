/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Languages {

    private String code;
    private String name;
    private String nameNative;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Languages() {
    }

    /**
     * 
     * @param nameNative
     * @param name
     * @param code
     */
    public Languages(String code, String name, String nameNative) {
        super();
        this.code = code;
        this.name = name;
        this.nameNative = nameNative;
    }

    public String getCode() {
        return code;
    }

    

    public String getName() {
        return name;
    }

    

    public String getNameNative() {
        return nameNative;
    }

    

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("name", name).append("nameNative", nameNative).append("additionalProperties", additionalProperties).toString();
    }

}
