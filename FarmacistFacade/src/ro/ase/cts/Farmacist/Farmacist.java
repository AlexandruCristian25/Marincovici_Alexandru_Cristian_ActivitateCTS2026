package ro.ase.cts.Farmacist;

public class Farmacist {
    
    private String nume;
    
    public Farmacist(String nume) {
        this.nume = nume;
    }
    
    public void verificaReteta(String medicament) {
        System.out.println("Farmacistul " + nume + " a verificat medicamentul: " + medicament);
    }
    
}