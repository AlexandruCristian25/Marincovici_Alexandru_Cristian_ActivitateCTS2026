package com.example;

public class Departament implements IFabrica {

    private Fabrica fabrica;

    public Departament(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    @Override
    public void info() {
        System.out.println("Fabrica din locatia " + fabrica.getLocatie() +
                " are capacitatea de " + fabrica.getCapacitate());
    }

    @Override
    public String toString() {
        return "Departament [fabrica=" + fabrica + "]";
    }
}
