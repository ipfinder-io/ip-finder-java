package examples;



import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;

public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", "");

        try {
            
            String asn = "as1";
            ipfinder.authentication(asn);
        } catch (IPfinderException ex) {
            // Handle error
            System.out.println(e);
        }
    }
}
