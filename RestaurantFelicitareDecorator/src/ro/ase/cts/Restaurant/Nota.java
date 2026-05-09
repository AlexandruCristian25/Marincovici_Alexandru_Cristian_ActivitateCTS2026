
package com.example;

public class Nota implements INota {

    private final String detalii;
    private final int nrNota;

    public Nota(String detalii, int nrNota) {
        this.detalii = detalii;
        this.nrNota = nrNota;
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Nota #" + nrNota + " - " + detalii);
    }
}
