package ro.ase.cts.SenzorAer;

public class Main {
    public static void main(String[] args) {

        AirQualitySensor sensor = new AirQualitySensor.Builder("Bucuresti", 35.5, 50.2)
                .setWifiEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        sensor.displayInfo();
    }
}
