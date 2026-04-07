package ro.ase.cts.Agentie;

public class AutocarInchiriat {
    
    private Autocar autocar;
    
    public AutocarInchiriat(Autocar autocar) {
        
        this.autocar = autocar;
        
    }
    
    public void inchiriereAutocar() {
        
        System.out.println("Autocarul " + autocar.toString() + " a fost inchiriat");
        
    }
    
    @Override
    public String toString() {
        
        return "AutocarInchiriat [autocar=" + autocar + "]";
        
    }
    
}