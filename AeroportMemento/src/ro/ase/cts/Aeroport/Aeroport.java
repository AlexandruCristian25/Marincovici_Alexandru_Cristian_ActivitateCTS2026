package ro.ase.cts.Aeroport;

public class Aeroport {
    
    private String numeClient;
    private double pretBilet;
    
    public Aeroport(String numeClient, double pretBilet) {
        super();
        this.numeClient = numeClient;
        this.pretBilet = pretBilet;
    }
    
    public double getPretBilet() {
        return pretBilet;
    }
    
    public void setPretBilet(double pretBilet) {
        this.pretBilet = pretBilet;
    }
    
    @Override
    public String toString() {
        return "Aeroport [pretBilet=" + pretBilet + "]";
    }
    
    public AeroportMemento salvareMemento() {
        return new AeroportMemento(pretBilet);
    }
    
    public void undoToMemento(AeroportMemento memento) {
        this.pretBilet = memento.getPretBilet();
    }
    
}