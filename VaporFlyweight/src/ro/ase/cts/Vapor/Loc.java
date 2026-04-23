package ro.ase.cts.Vapor;

public class Loc implements ILoc {
    
    private int nrLoc;
    private int nrRand;
    
    public Loc(int nrLoc, int nrRand) {
        super();
        this.nrLoc = nrLoc;
        this.nrRand = nrRand;
    }
    
    @Override
    public void afisare(RezervareLoc locRezervat) {
        System.out.println(this.toString() + " " + locRezervat.toString());
    }
    
    @Override
    public String toString() {
        return "Loc [nrLoc=" + nrLoc + ", nrRand=" + nrRand + "]";
    }
    
}