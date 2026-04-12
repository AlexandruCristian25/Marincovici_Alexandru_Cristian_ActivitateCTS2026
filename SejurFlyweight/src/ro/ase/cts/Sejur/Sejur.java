package ro.ase.cts.Sejur;

public class Sejur implements ISejur {
    
    private String numeOperator;
    private String locatie;
    private String oferta;
    
    public Sejur(String numeOperator, String locatie, String oferta) {
        super();
        this.numeOperator = numeOperator;
        this.locatie = locatie;
        this.oferta = oferta;
    }
    
    @Override
    public void printare(Rezervare rezervare) {
        System.out.println(this.toString() + " " + rezervare.toString());
    }
    
    @Override
    public String toString() {
        return "Sejur [numeOperator=" + numeOperator + ", locatie=" + locatie + ", oferta=" + oferta + "]";
    }
    
}