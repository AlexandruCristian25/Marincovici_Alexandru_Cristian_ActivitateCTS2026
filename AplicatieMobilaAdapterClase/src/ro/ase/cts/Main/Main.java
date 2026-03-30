package ro.ase.cts.Main;

import ro.ase.cts.Aplicatie.IAplicatieMobila;
import ro.ase.cts.Aplicatie.Software;
import ro.ase.cts.Aplicatie.AplicatieMobila;
import ro.ase.cts.Aplicatie.Aplicatie;

public class Main {

    public static void afiseazaAplicatie(IAplicatieMobila iAplicatie) {
        System.out.println("Tip aplicatie: ");
        iAplicatie.descriere();
        System.out.println("Se creeaza software-ul");
        iAplicatie.creeazaSoftware();
    }

    public static void main(String[] args) {

        IAplicatieMobila software = new Software();
        afiseazaAplicatie(software);

        Aplicatie aplicatie = new Aplicatie("WhatsApp", 150);
        IAplicatieMobila aplicatieMobila = new AplicatieMobila(aplicatie);
        afiseazaAplicatie(aplicatieMobila);
    }
}
