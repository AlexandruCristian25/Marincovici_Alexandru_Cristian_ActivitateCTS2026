package ro.ase.cts.Sejur;

public class Rezervare {
    
    private String numeClient;
    private String tara;
    private String oferta;

    public Rezervare(String numeClient, String tara, String oferta) {
        super();
        this.numeClient = numeClient;
        this.tara = tara;
        this.oferta = oferta;
    }
    
    @Override
    public String toString() {
        return "Rezervare [numeClient=" + numeClient + ", tara=" + tara + ", oferta=" + oferta + "]";
    }
    
}