package ro.ase.cts.Teatru;

public class RezervareProxy implements ISceneta {
    
    private Spectator spectator;
    
    public RezervareProxy(Spectator spectator) {
        this.spectator = spectator;
    }
    
    @Override
    public void detalii() {
        spectator.detalii();
    }
    
    @Override
    public void rezervaLoc() {
        
        if(spectator.getNrLoc() >= 57) {
            System.out.println("Rezervare cu succes, spectatorul " 
                + spectator.getNume() + " are locul " + spectator.getNrLoc());
        } else {
            System.out.println("Nu se poate face rezervarea pentru locul " + spectator.getNrLoc());
        }
        
    }
    
}