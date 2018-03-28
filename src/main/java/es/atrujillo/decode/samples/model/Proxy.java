package es.atrujillo.decode.samples.model;

/**
 * @author Arnaldo Trujillo
 */
public class Proxy {

    private String host;

    private int port;

    private String proxyUser;

    private String proxyPass;

    public Proxy(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Proxy(String host, int port, String proxyUser, String proxyPass) {
        this.host = host;
        this.port = port;
        this.proxyUser = proxyUser;
        this.proxyPass = proxyPass;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getProxyUser() {
        return proxyUser;
    }

    public String getProxyPass() {
        return proxyPass;
    }

    @Override
    public String toString() {
        return host + ":" + port;
    }
}
