import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.data.DomainByResponse;
import io.ipfinder.api.exception.IPfinderException;

public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", "");

        try {
        	String by = "DZ";

            DomainByResponse response = ipfinder.getDomainBy(by);

            // print data
            System.out.println(response);

        } catch (IPfinderException ex) {
            // Handle error
            System.out.println(e);
        }
    }
}
