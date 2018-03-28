package es.atrujillo.decode.samples;

import es.atrujillo.decode.samples.model.*;

/**
 * @author Arnaldo Trujillo
 */
public class DemoStepBuilder {

    public static void main(String[] args) {

        WifiConnection connection = WifiConnection.builder()
                .ssid("decode_wifi")
                .auth(new WifiAuth(AuthType.WP2, "love programming"))
                .ipConfig(IPConfig.DHCP)
                .build();

        WifiConnection connectionWithProxy = WifiConnection.builder()
                .ssid("dummy_wifi")
                .auth(new WifiAuth(AuthType.WEP, "hack me"))
                .proxy(new Proxy("proxy.unblogdecode.es", 23))
                .wifiFrequency(WifiFrequency.FIVE_GHz)
                .build();


        System.out.println(connection.toString());
        System.out.println(connectionWithProxy.toString());
    }

}
