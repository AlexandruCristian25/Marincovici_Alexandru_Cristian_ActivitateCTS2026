package ro.ase.cts.Oras;

public class PachetProxy implements PachetTuristic {
    
    private PachetTransport pachet;
    
    public PachetProxy(PachetTransport pachet) {
        this.pachet = pachet;
    }
    
    public PachetProxy(Oras oras) {
        this.pachet = new PachetTransport(oras);
    }
    
    @Override
    public void descriere() {
        pachet.descriere();
    }
    
    @Override
    public void rezervare() {
        
        // exemplu de regulă Proxy: doar dacă nu e România
        if(!pachet.getOras().getTara().equals("Romania")) {
            
            pachet.rezervare();
            
        } else {
            
            System.out.println("Rezervare esuata deoarece orasul este in Romania");
            
        }
        
    }
    
}