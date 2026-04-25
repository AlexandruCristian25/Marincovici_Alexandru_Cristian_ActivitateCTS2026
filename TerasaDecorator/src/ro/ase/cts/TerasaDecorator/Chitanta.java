package ro.ase.cts.Terasa;

public class Chitanta implements IChitanta {

    private int nrChitanta;
    private double suma;

    public Chitanta(int nrChitanta, double suma) {
        this.nrChitanta = nrChitanta;
        this.suma = suma;
    }

    public int getNrChitanta() {
        return nrChitanta;
    }

    public void setNrChitanta(int nrChitanta) {
        this.nrChitanta = nrChitanta;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaChitanta() {
        System.out.println("Chitanta cu numarul " + nrChitanta + " are suma de " + suma + " lei");
    }
    
}