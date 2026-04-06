package ro.ase.cts.Joc;

public class Joc implements IJoc {
    
    private int pret;
    private int dataLansare;
    private int nrBucati;
    
    public Joc(int pret, int dataLansare, int nrBucati) {
        
        super();
        this.pret = pret;
        this.dataLansare = dataLansare;
        this.nrBucati = nrBucati;
        
    }
    
    @Override
    public void info(Achizitie achizitie) {
        
        System.out.println(this.toString() + " " + achizitie.toString());
        
    }
    
    @Override
    public String toString() {
        
        return "Joc [ pret = " + pret + ", dataLansare = " + dataLansare + ", nrBucati = " + nrBucati + "]";
        
    }
    
}