package ro.ase.cts.Main;

import ro.ase.cts.Farmacie.*;

public class Main {
    public static void main(String[] args) {

        Medicament m1 = MedicamentFactory.creareMedicament(
                TipMedicament.RACEALA, "Coldrex", 25.5f);

        Medicament m2 = MedicamentFactory.creareMedicament(
                TipMedicament.DURERE, "Nurofen", 30.0f);

        Medicament m3 = MedicamentFactory.creareMedicament(
                TipMedicament.BODY, "Whey Protein", 120.0f);

        m1.afiseazaDescriere();
        m2.afiseazaDescriere();
        m3.afiseazaDescriere();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
