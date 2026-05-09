package com.example;

public class Main {

    private static void detalii(IFabrica fabrica) {
        System.out.println("Pentru piata:");
        fabrica.info();
    }

    public static void main(String[] args) {

        Fabrica fabrica1 = new Fabrica("Locatie1", 4500.90);
        IFabrica departament = new Departament(fabrica1);
        detalii(departament);

        System.out.println(fabrica1);

        System.out.println("Utilizeaza adapter:");
        Fabrica fabrica2 = new Fabrica("Locatie2", 5700.90);
        IFabrica departament2 = new Departament(fabrica2);
        detalii(departament2);

        System.out.println(fabrica2);
    }
}
