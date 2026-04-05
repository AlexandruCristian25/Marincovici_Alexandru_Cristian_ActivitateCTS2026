package ro.ase.cts.Comanda;

public class Comanda implements IComanda {
    
    private int nrComanda;
    private double pret;
    
    public Comanda(int nrComanda, double pret) {
        super();
        this.nrComanda = nrComanda;
        this.pret = pret;
    }
    
    public int getNrComanda() {
        return nrComanda;
    }
    
    public void setNrComanda(int nrComanda) {
        this.nrComanda = nrComanda;
    }
    
    public double getPret() {
        return pret;
    }
    
    public void setPret(double pret) {
        this.pret = pret;
    }
    
    @Override
    public void afiseazaComanda() {
        System.out.println("Comanda cu numarul " + nrComanda + " are pretul de " + pret + " lei");
    }
    
}