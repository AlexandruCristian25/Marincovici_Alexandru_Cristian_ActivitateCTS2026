package ro.ase.cts.Farmacie;

public class MedicamentDurere extends Medicament {

    public MedicamentDurere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicament pentru durere: " + denumire);
    }
}
