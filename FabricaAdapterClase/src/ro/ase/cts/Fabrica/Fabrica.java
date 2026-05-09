package com.example;

public class Fabrica {

    private String locatie;
    private double capacitate;

    public Fabrica(String locatie, double capacitate) {
        this.locatie = locatie;
        this.capacitate = capacitate;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public double getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(double capacitate) {
        this.capacitate = capacitate;
    }

    @Override
    public String toString() {
        return "Fabrica [locatie=" + locatie + ", capacitate=" + capacitate + "]";
    }
}
