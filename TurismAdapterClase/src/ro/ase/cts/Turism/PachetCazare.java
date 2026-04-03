package ro.ase.cts.Turism;

public class PachetCazare implements PachetTuristic {
    
    @Override
    public void descriere() {
        System.out.println("Acest pachet contine cazare");
    }
    
    @Override
    public void rezervarePachet() {
        System.out.println("A fost realizata o rezervare");
    }
    
}