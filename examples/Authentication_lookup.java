import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.data.IPResponse;
import io.ipfinder.api.exception.IPfinderException;

public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", "");

        try {
            
            IPResponse response = ipfinder.authentication();

            System.out.println(response.toString());

            // print city name
            System.out.println(response.getCity());
        } catch (IPfinderException ex) {
            // Handle error
            System.out.println(ex);
        }
    }
}
