package ro.ase.cts.Stadion;

public class AsezareCoada extends IntrareStadion {
    
    public AsezareCoada(int nrLoc) {
        
        super(nrLoc);
        
    }
    
    @Override
    public void asezareCoada(int nrLoc) {
        
        System.out.println("Asezare la coada pentru locul " + nrLoc);
        
    }
    
    @Override
    public void prezentareBilet(int nrLoc) {
        
        
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