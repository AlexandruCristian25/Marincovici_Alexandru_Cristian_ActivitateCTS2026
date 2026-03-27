package ro.ase.cts.Oras;

public class PachetTransport implements PachetTuristic {
    
    private Oras oras;
    
    public Oras getOras() {
        
        return oras;
        
    }
    
    public void setOras(Oras oras) {
        
        this.oras = oras;
        
    }
    
    public PachetTransport(Oras oras) {
        
        this.oras = oras;
        
    }
    
    @Override
    public void descriere() {
        
        System.out.println("Acest pachet include trsnsport");
        
    }
    
    @Override
    public void rezervare() {
        
        System.out.println(oras.getNume() + " a rezervat un pachet de transport");
        
    }
    
}