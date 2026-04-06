package ro.ase.cts.Bon;

public class Bon implements IBon {
    
    private int nrBon;
    private double suma;
    
    public Bon(int nrBon, double suma) {
        super();
        this.nrBon = nrBon;
        this.suma = suma;
    }
    
    @Override
    public void printeazaBon() {
        System.out.println("Bonul cu numarul " + nrBon + " are suma de " + suma + " lei");
    }
    
    public int getNrBon() {
        return nrBon;
    }
    
    public void setNrBon(int nrBon) {
        this.nrBon = nrBon;
    }
    
    public double getSuma() {
        return suma;
    }
    
    public void setSuma(double suma) {
        this.suma = suma;
    }
    
}