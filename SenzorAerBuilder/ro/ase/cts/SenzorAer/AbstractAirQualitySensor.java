package ro.ase.cts.SenzorAer;

public abstract class AbstractAirQualitySensor {
    protected String locatie;
    protected double pm25;
    protected double pm10;
    protected boolean wifiEnabled;
    protected boolean bluetoothEnabled;

    public abstract void displayInfo();
}
