package ro.ase.cts.Farmacie;

public class MedicamentFactory {

    public static Medicament creareMedicament(TipMedicament tip, String denumire, float pret) {

        switch (tip) {
            case RACEALA:
                return new MedicamentRaceala(denumire, pret);
            case DURERE:
                return new MedicamentDurere(denumire, pret);
            case BODY:
                return new MedicamentBody(denumire, pret);
            default:
                throw new IllegalArgumentException("Tip medicament invalid");
        }
    }
}
