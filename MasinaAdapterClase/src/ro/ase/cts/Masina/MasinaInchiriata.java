package ro.ase.cts.Masina;

public class MasinaInchiriata implements IMasina {
    
    private Masina masina;
    
    public MasinaInchiriata(Masina masina) {
        this.masina = masina;
    }
    
    public void inchiriazaMasina() {
        System.out.println("Masina inchiriata " + masina.toString());
    }
    
    @Override
    public void info() {
        System.out.println("Info masina inchiriata: " + masina.toString());
    }
    
    @Override
    public void pachetMasina() {
        inchiriazaMasina();
    }
    
    @Override
    public String toString() {
        return "MasinaInchiriata [masina=" + masina + "]";
    }
    
}