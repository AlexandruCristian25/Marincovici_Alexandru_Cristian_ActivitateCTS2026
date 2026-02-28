package ro.ase.cts.SenzorAer;

public class AirQualitySensor extends AbstractAirQualitySensor {

    private AirQualitySensor(Builder builder) {
        this.locatie = builder.locatie;
        this.pm25 = builder.pm25;
        this.pm10 = builder.pm10;
        this.wifiEnabled = builder.wifiEnabled;
        this.bluetoothEnabled = builder.bluetoothEnabled;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "AirQualitySensor{" +
                "locatie='" + locatie + '\'' +
                ", pm25=" + pm25 +
                ", pm10=" + pm10 +
                ", wifiEnabled=" + wifiEnabled +
                ", bluetoothEnabled=" + bluetoothEnabled +
                '}';
    }

    public static class Builder {
        private String locatie;
        private double pm25;
        private double pm10;
        private boolean wifiEnabled;
        private boolean bluetoothEnabled;

        public Builder(String locatie, double pm25, double pm10) {
            this.locatie = locatie;
            this.pm25 = pm25;
            this.pm10 = pm10;
        }

        public Builder setWifiEnabled(boolean wifiEnabled) {
            this.wifiEnabled = wifiEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public AirQualitySensor build() {
            return new AirQualitySensor(this);
        }
    }
}
