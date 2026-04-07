package ro.ase.cts.Cabana;

public class PachetVacanta implements PachetTurism {
    
    private Proprietar proprietar;
    
    public Proprietar getProprietar() {
        
        return proprietar;
        
    }
    
    public void setProprietar(Proprietar proprietar) {
        
        this.proprietar = proprietar;
        
    }
    
    public PachetVacanta(Proprietar proprietar) {
        
        this.proprietar = proprietar;
        
    }
    
    @Override
    public void info() {
        
        System.out.println("Pachet de vacanta");
        
    }
    
    @Override
    public void rezervarePachet() {
        
        System.out.println(proprietar.getNume() + " a oferit un pachet de vacanta");
        
    }
    
}