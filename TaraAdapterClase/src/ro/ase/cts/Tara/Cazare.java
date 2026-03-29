package ro.ase.cts.Tara;

public class Cazare implements ITara {
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Cazare rezervata");
        
    }
    
    @Override
    public void rezervaPachet() {
        
        System.out.println("A fost realizata o rezervare a unhi pachet de vacanta");
        
    }
    
}