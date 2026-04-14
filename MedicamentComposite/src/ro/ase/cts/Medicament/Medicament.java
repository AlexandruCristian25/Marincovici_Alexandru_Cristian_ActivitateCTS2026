package ro.ase.cts.Medicament;

public class Medicament implements Sectiune {
    
    private String nume;
    
    public Medicament(String nume) {
        this.nume = nume;
    }
    
    @Override
    public void adaugareMedicament(Sectiune sectiune) {
        throw new UnsupportedOperationException("Operatie invalida");
    }
    
    @Override
    public void stergeMedicament(Sectiune sectiune) {
        throw new UnsupportedOperationException("Operatie invalida");
    }
    
    @Override
    public Sectiune getMedicament(int index) {
        throw new UnsupportedOperationException("Operatie invalida");
    }
    
    @Override
    public void info() {
        System.out.println("Medicament: " + nume);
    }
    
}