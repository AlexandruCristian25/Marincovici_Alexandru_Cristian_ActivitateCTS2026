package ro.ase.cts.Turism;

import ro.ase.cts.Turism.Autocar;
import ro.ase.cts.Turism.AutocarInchiriat;

public class PachetAutocarInchiriat extends AutocarInchiriat implements PachetTuristic {
    
    public PachetAutocarInchiriat(Autocar autocar) {
        
        super(autocar);
        
    }
    
    @Override
    public void descriere() {
        
        System.out.println(super.toString());
        
    }
    
    @Override
    public void rezervarePachet() {
        
        super.inchiriazaAutocar();
        
    }
    
}