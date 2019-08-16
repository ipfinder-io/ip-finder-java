<img src='https://camo.githubusercontent.com/46886c3e689a0d4a3f6c0733d1cab5d9f9a3926d/68747470733a2f2f697066696e6465722e696f2f6173736574732f696d616765732f6c6f676f732f6c6f676f2e706e67' height='60' alt='IP Finder'></a>
#  IPFinder Java Client Library

The official Java client library for the [IPFinder.io](https://ipfinder.io) get details for :
-  IP address details (city, region, country, postal code, latitude and more ..)
-  ASN details (Organization name, registry,domain,comany_type, and more .. )
-  Firewall by supported formats details (apache_allow,  nginx_deny, CIDR , and more ..)
-  IP Address Ranges by the Organization name  details (list_asn, list_prefixes , and more ..)
-  service status details (queriesPerDay, queriesLeft, key_type, key_info)
- Get Domain IP (asn, organization,country_code ....)
- Get Domain IP history (total_ip, list_ip,organization,asn ....)
- Get list Domain By ASN, Country,Ranges (select_by , total_domain  , list_domain ....)

## Getting Started
singup for a free account at [https://ipfinder.io/auth/signup](https://ipfinder.io/auth/signup), for Free IPFinder API access token.

The free plan is limited to 4,000 requests a day, and doesn't include some of the data fields
To enable all the data fields and additional request volumes see [https://ipfinder.io/pricing](https://ipfinder.io/pricing).

## Documentation

See the [official documentation](https://ipfinder.io/docs).

## Installation
Add these values to your pom.xml file:


```xml
<dependencies>
    <dependency>

    </dependency>
</dependencies>
```

## With `free` TOKEN

```java
import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;

public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("", ""); //  emty token == free

        try {
            // lookup your IP address information
            ipfinder.authentication();
        } catch (IPfinderException e) {
            // Handle error
        }
    }
}

```

## Authentication

```java
import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;


public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", ""); 

        try {
            // lookup your IP address information
            ipfinder.authentication();
        } catch (IPfinderException e) {
            // Handle error
        }
    }
}

```

## Get IP address

```java
import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;


// lookup IP address information
public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", ""); 

        try {
            // lookup your IP address information
            String ip = "5.2.0.2";
            ipfinder.getAddressInfo(ip);
        } catch (IPfinderException e) {
            // Handle error
        }
    }
}

```

## Get ASN
This API available as part of our Pro and enterprise [https://ipfinder.io/pricing](https://ipfinder.io/pricing).

```java
import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;


// lookup Asn information
public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", ""); 

        try {
            // lookup Asn information
            String asn = "as1";
            ipfinder.authentication(asn);
        } catch (IPfinderException e) {
            // Handle error
        }
    }
}
```

## Firewall
This API available as part of our  enterprise [https://ipfinder.io/pricing](https://ipfinder.io/pricing).
formats supported are :  `apache_allow`, `apache_deny`,`nginx_allow`,`nginx_deny`, `CIDR`, `linux_iptables`, `netmask`, `inverse_netmask`, `web_config_allow `, `web_config_deny`, `cisco_acl`, `peer_guardian_2`, `network_object`, `cisco_bit_bucket`, `juniper_junos`, `microtik`

```java
import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;


public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", ""); 

        try {
            // lookup Asn Firewall information
            String asn = "as36947";
            String format = "nginx_deny";
            ipfinder.getFirewall(asn,format);
        } catch (IPfinderException e) {
            // Handle error
        }
    }
}

```

## Get IP Address Ranges
This API available as part of our  enterprise [https://ipfinder.io/pricing](https://ipfinder.io/pricing).

```java
import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;


public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", ""); 

        try {
            // lookup Organization information
            String org = "Telecom Algeria";
            ipfinder.getRanges(org);
        } catch (IPfinderException e) {
            // Handle error
        }
    }
}

```

## Get service status

```java
import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;


public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", ""); 

        try {
            // lookup IP TOKEN information
            ipfinder.getStatus();
        } catch (IPfinderException e) {
            // Handle error
        }
    }
}

```

## Get Domain IP


```java
import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;

public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", ""); 

        try {
            String name = "google.com";
            ipfinder.getDomain(name);
        } catch (IPfinderException e) {
            // Handle error
        }
    }
}

```

## Get Domain IP history



```java
import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;

public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", ""); 

        try {
            String name = "google.com";
            ipfinder.getDomainHistory(name);
        } catch (IPfinderException e) {
            // Handle error
        }
    }
}

```

## Get list Domain By ASN, Country,Ranges


```java
import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;

// list live domain by country DZ,US,TN,FR,MA

public class Main {

    public static void main(String... args) {
        Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", ""); 

        try {
            String by = "DZ";
            ipfinder.getDomainBy(by);
        } catch (IPfinderException e) {
            // Handle error
        }
    }
}

```

## Add proxy
```javascript
Ipfinder ipfinder = new Ipfinder("YOUR_TOKEN_GOES_HERE", "https://ipfinder.yourdomain.com");
```

Sample codes under **examples/** folder.


## Contact

Contact Us With Additional Questions About Our API, if you would like more information about our API that isn’t available in our IP geolocation API developer documentation, simply [contact](https://ipfinder.io/contact) us at any time and we’ll be able to help you find what you need.

## License
----

[![GitHub license](https://img.shields.io/github/license/ipfinder-io/ip-finder-java.svg)](https://github.com/ipfinder-io/ip-finder-java)
