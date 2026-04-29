package ro.ase.cts.Cinema;

public class CinemaProxy implements ICinema {

    private ICinema pachetCinema;

    public CinemaProxy(ICinema pachetCinema) {
        
        this.pachetCinema = pachetCinema;
        
    }

    @Override
    public void detalii() {
        
        if (((PachetCinema) pachetCinema).getPersoana().getNrLoc() <= 100) {
            
            pachetCinema.detalii();
            
        } else {
            
            System.out.println("Persoana nu are voie sa intre in sala.");
            
        }
        
    }
    
}