import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.data.DomainResponse;
import io.ipfinder.api.exception.IPfinderException;

public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", "");

        try {

        	String name = "google.com";
            
            DomainResponse response = ipfinder.getDomain(name);

            // print data
            System.out.println(response);

        } catch (IPfinderException ex) {
            // Handle error
            System.out.println(e);
        }
    }
}
