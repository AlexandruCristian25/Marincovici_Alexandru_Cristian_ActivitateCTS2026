package ro.ase.cts.Autobuz;

public class Grup implements Optiune {
    
    private String nume;
    
    public Grup(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        throw new UnsupportedOperationException("Nu exista implementare");
    }
    
    @Override
    public void stergeNod(Optiune optiune) {
        throw new UnsupportedOperationException("Nu exista implementare");
    }
    
    @Override
    public Optiune getNod(int index) {
        throw new UnsupportedOperationException("Nu exista implementare");
    }
    
    @Override
    public void afisareInfo() {
        System.out.println("Grup: " + nume);
    }
    
}