/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.ip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Languages {

@SerializedName("code")
@Expose
private String code;
@SerializedName("name")
@Expose
private String name;
@SerializedName("name_native")
@Expose
private String nameNative;



/**
*
* @param nameNative
* @param name
* @param code
*/
public Languages(String code, String name, String nameNative) {
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



@Override
public String toString() {
return new ToStringBuilder(this).append("code", code).append("name", name).append("nameNative", nameNative).toString();
}

}
