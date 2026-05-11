package ro.ase.cts.Departament;

public class Doctor implements Optiune {
    
    private String nume;

    public Doctor(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        throw new UnsupportedOperationException("Nu este implementata");
    }

    @Override
    public void stergeNod(Optiune optiune) {
        throw new UnsupportedOperationException("Nu este implementata");
    }

    @Override
    public Optiune getNod(int index) {
        throw new UnsupportedOperationException("Nu este implementata");
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "Doctor: " + nume);
    }
    
}