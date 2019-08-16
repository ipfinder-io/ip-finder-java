package examples;

import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;

public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", "");

        try {
            
            String ip = "5.2.0.2";
            ipfinder.getAddressInfo(ip);
        } catch (IPfinderException ex) {
            // Handle error
            System.out.println(ex);
        }
    }
}
