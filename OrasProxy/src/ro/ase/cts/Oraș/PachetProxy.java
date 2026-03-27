package ro.ase.cts.Oras;

public class PachetProxy implements PachetTuristic {
    
    private PachetTuristic pachet;
    
    public ProxyPachet(PachetTransport pachet) {
        
        this.pachet = pachet;
        
    }
    
    public ProxyPachet(Oras oras) {
        
        this.oras = new PachetTransport(oras);
        
    }
    
    @Override
    public void descriere() {
        
        pachet.descriere();
        
    }
    
    @Override
    public void rezervare() {
        
        if(pachet.getOras().getTara >= "") {
            
            pachet.rezervare();
            
        } else {
            
            System.out.println("Rezervare esuata deoarece " + pachet.getOras().getNume() + " este in " + pachet.getOras().getTara());
            
        }
        
    }
    
}