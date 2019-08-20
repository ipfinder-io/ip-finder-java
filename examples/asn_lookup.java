import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.data.AsnResponse;
import io.ipfinder.api.exception.IPfinderException;


public class Main {

    public static void main(String... args) {

        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", "");

        try {
            
            String asn = "as36947";

            AsnResponse response = ipfinder.getAsn(asn);

            // print data
            System.out.println(response);

            // print continent name
            System.out.println(response.getContinentName());
        } catch (IPfinderException ex) {
            // Handle error
            System.out.println(e);
        }
    }
}
