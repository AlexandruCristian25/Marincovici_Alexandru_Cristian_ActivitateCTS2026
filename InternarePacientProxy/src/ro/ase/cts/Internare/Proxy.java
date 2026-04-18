package ro.ase.cts.Internare;

public class Proxy implements Internare {
    
    private Internare internare;
    
    public Proxy(Internare internare) {
        this.internare = internare;
    }
    
    public Proxy(Pacient pacient) {
        this.internare = new Salon(pacient);
    }
    
    @Override
    public void descriere() {
        
        internare.descriere();
        
    }
    
    @Override
    public void rezervare() {
        
        Pacient pacient = ((Salon) internare).getPacient();
        
        if(pacient.getNrTelefon() != null && pacient.getNrTelefon().length() == 10) {
            
            internare.rezervare();
            
        } else {
            
            System.out.println("Internare nepermisa deoarece " 
                + pacient.getNume() 
                + " nu are nr de telefon " 
                + pacient.getNrTelefon() 
                + " valid");
            
        }
        
    }
    
}