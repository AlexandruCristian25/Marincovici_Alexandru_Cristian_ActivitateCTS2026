package ro.ase.cts.Cabana;

public class ProxyPachet implements PachetTurism {
    
    private PachetVacanta pachet;
    
    public ProxyPachet(PachetVacanta pachet) {
        this.pachet = pachet;
    }
    
    public ProxyPachet(Proprietar proprietar) {
        this.pachet = new PachetVacanta(proprietar); 
    }
    
    @Override
    public void info() {
        pachet.info();
    }
    
    @Override
    public void rezervarePachet() {
        
        if(pachet.getProprietar().getVarsta() > 70) {
            pachet.rezervarePachet();
            
        } else {
            
            System.out.println("Rezervare neefectuata, proprietarul " 
                + pachet.getProprietar().getNume() + " are doar " 
                + pachet.getProprietar().getVarsta() + " ani");
        }
        
    }
    
}