package es.atrujillo.decode.samples.model;

/**
 * @author Arnaldo Trujillo
 */
public enum WifiFrequency {
    TWO_POINT_FOUR_GHz("2.4 GHz"), FIVE_GHz("5 GHz");

    private String pretifyValue;

    WifiFrequency(String pretifyValue) {
        this.pretifyValue = pretifyValue;
    }

    @Override
    public String toString() {
        return pretifyValue;
    }
}
