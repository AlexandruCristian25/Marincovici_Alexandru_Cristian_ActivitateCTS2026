package ro.ase.cts.Aplicatie;

public class Aplicatie {
    
    private String nume;
    private int dimensiune;
    
    public String getNume() {
        
        return this.nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public int getDimensiune() {
        
        return this.dimensiune;
        
    }
    
    public void setDimensiune(int dimensiune) {
        
        this.dimensiune = dimensiune;
        
    }
    
    public Aplicatie(String nume, int dimensiune) {
        
        this.nume = nume;
        this.dimensiune = dimensiune;
        
    }
    
    @Override
    public String toString() {
        
        return "Aplicatie [nume= " + nume + " dimensiune= " + dimensiune + "]";
        
    }
    
}