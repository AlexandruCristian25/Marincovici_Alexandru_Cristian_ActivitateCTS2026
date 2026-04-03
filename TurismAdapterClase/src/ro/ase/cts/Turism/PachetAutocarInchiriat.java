package ro.ase.cts.Turism;

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