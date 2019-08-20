import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.data.StatusResponse;
import io.ipfinder.api.exception.IPfinderException;

public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", "");

        try {
            
            StatusResponse response = ipfinder.getStatus();

            // print data
            System.out.println(response);
        } catch (IPfinderException ex) {
            // Handle error
            System.out.println(e);
        }
    }
}
