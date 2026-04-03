package ro.ase.cts.Turism;

public class AutocarInchiriat {
    
    private Autocar autocar;
    
    public AutocarInchiriat(Autocar autocar) {
        this.autocar = autocar;
    }
    
    public void inchiriazaAutocar() {
        System.out.println("A fost inchiriat autocarul " + autocar.toString());
    }
    
    @Override
    public String toString() {
        return "AutocarInchiriat [ autocar = " + autocar + " ]";
    }
    
}