package examples;

import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;

public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", "");

        try {
        	String asn = "as36947";
        	String format = "nginx_deny";
            ipfinder.getFirewall(asn,format);
        } catch (IPfinderException ex) {
            // Handle error
            System.out.println(e);
        }
    }
}
