package ro.ase.cts.Main;

import ro.ase.cts.SenzorAer.AirQualitySensor;

public class Main {
    public static void main(String[] args) {

        AirQualitySensor sensor1 = new AirQualitySensor.Builder("Cluj", 20.1, 30.5)
                .setWifiEnabled(true)
                .build();

        AirQualitySensor sensor2 = new AirQualitySensor.Builder("Iasi", 40.3, 60.7)
                .setBluetoothEnabled(true)
                .build();

        System.out.println(sensor1);
        System.out.println(sensor2);
    }
}
