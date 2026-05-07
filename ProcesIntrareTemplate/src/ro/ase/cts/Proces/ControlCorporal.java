package ro.ase.cts.Stadion;

public class ControlCorporal extends IntrareStadion {
    
    public ControlCorporal(int nrLoc) {
        
        super(nrLoc);
        
    }
    
    @Override
    public void asezareCoada(int nrLoc) {
        
    }
    
    @Override
    public void prezentareBilet(int nrLoc) {
        
        System.out.println("Pentru locul " + nrLoc + " a fost prezentat biletul");
        
    }
    
    @Override
    public void controlCorporal(int nrLoc) {
        
        System.out.println("Inaine de a se ocupa locul " + nrLoc + " spectatorul este verificat");
        
    }
    
    @Override
    public void ocupareLoc(int nrLoc) {
        
        System.out.println("Locul " + nrLoc + " a fost ocupat");
        
    }
    
}