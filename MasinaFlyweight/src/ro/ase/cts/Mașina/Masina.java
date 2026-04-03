package ro.ase.cts.Masina;

public class Masina implements IMasina {
    
    private int nrUsi;
    private int capacitateCilindrica;
    
    public Masina(int nrUsi, int capacitateCilindrica) {
        
        super();
        this.nrUsi = nrUsi;
        this.capacitateCilindrica = capacitateCilindrica;
        
    }
    
    @Override
    public void afiseazaInfo(Rezervare rezervare) {
        
        System.out.println(this.toString() + " " + rezervare.toString());
        
    }
    
    @Override
    public String toString() {
        
        return "Masina [nrUsi=" + nrUsi + ", capacitateCilindrica=" + capacitateCilindrica + "]";
        
    }
    
}