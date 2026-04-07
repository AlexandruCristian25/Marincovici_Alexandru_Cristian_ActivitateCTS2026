package ro.ase.cts.Agentie;

public class PachetCazare implements IPachet {
    
    @Override
    public void info() {
        System.out.println("Pachetul contine cazare!");
    }
    
    @Override
    public void rezervarePachet() {
        System.out.println("Realizare pachet cazare efectuata cu succes!");
    }
    
}