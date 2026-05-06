package ro.ase.cts.Bilet;

public class Bilet implements IBilet {
    
    private int nrLoc;
    private double pret;
    
    public Bilet(int nrLoc, double pret) {
        this.nrLoc = nrLoc;
        this.pret = pret;
    }
    
    @Override
    public void cumparaBilet() {
        System.out.println("Biletul pentru locul " + nrLoc + " are pretul de " + pret + " lei");
    }
    
    public int getNrLoc() {
        return nrLoc;
    }
    
    public void setNrLoc(int nrLoc) {
        this.nrLoc = nrLoc;
    }
    
    public double getPret() {   
        return pret;
    }
    
    public void setPret(double pret) {
        this.pret = pret;
    }
    
}