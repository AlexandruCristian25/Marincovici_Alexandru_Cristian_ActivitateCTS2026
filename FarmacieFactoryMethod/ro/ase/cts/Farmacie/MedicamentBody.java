package ro.ase.cts.Farmacie;

public class MedicamentBody extends Medicament {

    public MedicamentBody(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supliment body: " + denumire);
    }
}
