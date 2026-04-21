package ro.ase.cts.Avion;

public class Avion {
    
    private double pretBilet;
    private int nrLocuri;
    
    public Avion(double pretBilet, int nrLocuri) {
        super();
        this.pretBilet = pretBilet;
        this.nrLocuri = nrLocuri;
    }
    
    public double getPretBilet() {
        return pretBilet;
    }
    
    public void setPretBilet(double pretBilet) {
        this.pretBilet = pretBilet;
    }
    
    public int getNrLocuri() {
        return nrLocuri;
    }
    
    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }
    
    public AvionMemento salvareMemento() {
        return new AvionMemento(this.pretBilet);
    }

    public void undoToMemento(AvionMemento memento) {
        this.pretBilet = memento.getPretBilet();
    }
    
    @Override
    public String toString() {
        return "Avion [pretBilet=" + pretBilet + ", nrLocuri=" + nrLocuri + "]";
    }
    
}