package ro.ase.cts.Loc;

public class Loc implements ILoc {
    
    private int nrLoc;
    private int rand;
    
    public Loc(int nrLoc, int rand) {
        super();
        this.nrLoc = nrLoc;
        this.rand = rand;
    }
    
    @Override
    public void afiseazaInfo() {
        System.out.println("Locul are " + nrLoc + " si se afla pe randul " + rand);
    }
    
    public int getNrLoc() {
        return nrLoc;
    }
    
    public void setNrLoc(int nrLoc) {
        this.nrLoc = nrLoc;
    }
    
    public int getRand() {
        return rand;
    }
    
    public void setRand(int rand) {
        this.rand = rand;
    }
    
}