package ro.ase.cts.ContBancar;

public class Persoana {

    private int varsta;
    private boolean areCazier;
    private boolean areAltCont;

    public Persoana() {
        
    }

    public boolean areCazier(boolean areCazier) {
        return !areCazier;
    }

    public boolean areAltCont(boolean areAltCont) {
        return !areAltCont;
    }
    
}