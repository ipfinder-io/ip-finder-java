/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.ip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Currency {

@SerializedName("name")
@Expose
private String name;
@SerializedName("symbol")
@Expose
private String symbol;
@SerializedName("symbol_native")
@Expose
private String symbolNative;



/**
*
* @param symbolNative
* @param symbol
* @param name
*/
public Currency(String name, String symbol, String symbolNative) {
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



@Override
public String toString() {
return new ToStringBuilder(this).append("name", name).append("symbol", symbol).append("symbolNative", symbolNative).toString();
}

}
