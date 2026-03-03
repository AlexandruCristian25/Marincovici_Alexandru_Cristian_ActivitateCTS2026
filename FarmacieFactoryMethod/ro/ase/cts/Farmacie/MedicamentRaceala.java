package ro.ase.cts.Farmacie;

public class MedicamentRaceala extends Medicament {

    public MedicamentRaceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicament pentru raceala: " + denumire);
    }
}
