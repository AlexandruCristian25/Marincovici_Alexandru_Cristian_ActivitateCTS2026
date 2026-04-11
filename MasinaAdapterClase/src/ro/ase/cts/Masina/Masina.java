package ro.ase.cts.Masina;

public class Masina {
    
    private String marca;
    private int nrUsi;
    
    public Masina(String marca, int nrUsi) {
        this.marca = marca;
        this.nrUsi = nrUsi;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getNrUsi() {
        return nrUsi;
    }
    
    public void setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
    }
    
    @Override
    public String toString() {
        return "Masina [marca=" + marca + ", nrUsi=" + nrUsi + "]";
    }
    
}