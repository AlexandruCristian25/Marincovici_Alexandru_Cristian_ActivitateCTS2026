package ro.ase.cts.Bilet;

public class Bilet implements IBilet {
    
    private int nrLoc;
    private String nume;
    
    public Bilet(int nrLoc, String nume) {
        
        super();
        this.nrLoc = nrLoc;
        this.nume = nume;
        
    }
    
    public void afiseazaInfo() {
        
        System.out.println("Biletul cu numarul locului " + nrLoc + " a fost achizitionat de " + nume);
        
    }
    
    public int getNrLoc() {
        
        return nrLoc;
        
    }
    
    public void setNrLoc(int nrLoc) {
        
        this.nrLoc = nrLoc;
        
    }
    
    public String getNume() {
        
        return nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
}