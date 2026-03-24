package ro.ase.cts.Turism;

public class PachetCazare implements PachetTutistic {
    
    @Override
    public void descriere() {
        
        Systrm.out.println("Acest pachet contine cazare");
        
    }
    
    @Override
    public void rezervarePachet() {
        
        System.out.println("A fost realizata o rezervata");
        
    }
    
}