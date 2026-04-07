package ro.ase.cts.Agentie;

import ro.ase.cts.Agentie.Autocar;
import ro.ase.cts.Agentie.AutocarInchiriat;

public class PachetAutocarInchiriat extends AutocarInchiriat implements IPachet {
    
    public PachetAutocarInchiriat(Autocar autocar) {
        
        super(autocar);
        
    }
    
    @Override
    public void info() {
        
        System.out.println(super.toString());
        
    }
    
    @Override
    public void rezervarePachet() {
        
        super.inchiriereAutocar();
        
    }
    
}