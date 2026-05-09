
package com.example;

public class Main {
    public static void main(String[] args) {

        Nota nota = new Nota("Detalii1", 36526);
        nota.printeazaFelicitare();

        Decorator notaDecorata = new NotaDecorata(nota);
        notaDecorata.printeazaFelicitare();

    }
}
