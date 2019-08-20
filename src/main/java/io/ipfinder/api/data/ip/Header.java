/**
 * Copyright (C) 2019 Mohamed Ben rebia.
 */
package io.ipfinder.api.data.ip;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Header {

@SerializedName("total_user_agent")
@Expose
private long totalUserAgent;
@SerializedName("list_user_agent")
@Expose
private List<ListUserAgent> listUserAgent = null;


/**
*
* @param totalUserAgent
* @param listUserAgent
*/
public Header(long totalUserAgent, List<ListUserAgent> listUserAgent) {
this.totalUserAgent = totalUserAgent;
this.listUserAgent = listUserAgent;
}

public long getTotalUserAgent() {
return totalUserAgent;
}



public List<ListUserAgent> getListUserAgent() {
return listUserAgent;
}



@Override
public String toString() {
return new ToStringBuilder(this).append("totalUserAgent", totalUserAgent).append("listUserAgent", listUserAgent).toString();
}

}
