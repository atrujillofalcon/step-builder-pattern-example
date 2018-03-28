package es.atrujillo.decode.samples.model;

import java.util.Objects;

public class WifiConnection {

    private String ssid;

    private WifiAuth wifiAuth;

    private Proxy proxy;

    private IPConfig ipConfig;

    private WifiFrequency wifiFrequency;

    private WifiConnection(String ssid, WifiAuth wifiAuth, Proxy proxy, IPConfig ipConfig, WifiFrequency wifiFrequency) {
        this.ssid = ssid;
        this.wifiAuth = wifiAuth;
        this.proxy = proxy;
        this.ipConfig = ipConfig;
        this.wifiFrequency = wifiFrequency;
    }

    public interface SsidStep {
        AuthStep ssid(String ssid);
    }

    public interface AuthStep {
        Build auth(WifiAuth auth);
    }

    public interface Build {

        WifiConnection build();

        Build proxy(Proxy proxy);

        Build ipConfig(IPConfig ipConfig);

        Build wifiFrequency(WifiFrequency frequency);

    }

    public static SsidStep builder() {
        return new Builder();
    }


    private static class Builder implements SsidStep, AuthStep, Build {

        private String ssid;
        private WifiAuth wifiAuth;
        private Proxy proxy;
        private IPConfig ipConfig;
        private WifiFrequency wifiFrequency;

        @Override
        public WifiConnection build() {
            return new WifiConnection(this.ssid, this.wifiAuth, this.proxy, this.ipConfig, this.wifiFrequency);
        }

        @Override
        public AuthStep ssid(String ssid) {
            Objects.requireNonNull(ssid);
            this.ssid = ssid;
            return this;
        }

        @Override
        public Build auth(WifiAuth auth) {
            Objects.requireNonNull(auth);
            this.wifiAuth = auth;
            return this;
        }

        @Override
        public Build proxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        @Override
        public Build ipConfig(IPConfig ipConfig) {
            this.ipConfig = ipConfig;
            return this;
        }

        @Override
        public Build wifiFrequency(WifiFrequency frequency) {
            this.wifiFrequency = frequency;
            return this;
        }
    }

    @Override
    public String toString() {
        return " SSID: " + ssid +
                " AUTH: " + wifiAuth.getAuthType() +
                " PROXY: " + proxy +
                " IP: " + ipConfig +
                " FREQUENCY: " + wifiFrequency;
    }
}
