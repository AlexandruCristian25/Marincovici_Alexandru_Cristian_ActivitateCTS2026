
package com.example;

public class NotaDecorata extends Decorator {

    public NotaDecorata(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        super.printeazaFelicitare();
        System.out.println("Va multumim pentru vizita! Va mai asteptam!");
    }
}
