package ro.ase.cts.Teatru;

public class Spectator implements ISceneta {
    
    private String nume;
    private int nrLoc;
    
    public Spectator(String nume, int nrLoc) {
        super();
        this.nume = nume;
        this.nrLoc = nrLoc;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public int getNrLoc() {
        return nrLoc;
    }
    
    public void setNrLoc(int nrLoc) {
        this.nrLoc = nrLoc;
    }
    
    @Override
    public String toString() {
        return "Spectator [nume=" + nume + ", nrLoc=" + nrLoc + "]";
    }

    @Override
    public void detalii() {
        System.out.println(this.toString());
    }

    @Override
    public void rezervaLoc() {
        System.out.println("Rezervare realizata pentru " + nume + " pe locul " + nrLoc);
    }
    
}