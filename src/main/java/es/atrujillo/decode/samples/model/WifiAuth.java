package es.atrujillo.decode.samples.model;

/**
 * @author Arnaldo Trujillo
 */
public class WifiAuth {

    private AuthType authType;

    private String wifiPass;

    public WifiAuth(AuthType authType, String wifiPass) {
        this.authType = authType;
        this.wifiPass = wifiPass;
    }

    public AuthType getAuthType() {
        return authType;
    }

    public String getWifiPass() {
        return wifiPass;
    }
}
