
package com.example;

public abstract class Decorator implements INota {

    protected final INota nota;

    public Decorator(INota nota) {
        this.nota = nota;
    }

    @Override
    public void printeazaFelicitare() {
        nota.printeazaFelicitare();
    }
}
