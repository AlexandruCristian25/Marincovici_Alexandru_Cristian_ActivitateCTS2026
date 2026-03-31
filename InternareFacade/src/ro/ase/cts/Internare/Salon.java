package ro.ase.cts.Internare;

public class Salon {
    
    private int nrSalon;
    private int nrPaturi;
    
    private Salon(int nrSalon, int nrPaturi) {
        
        this.nrSalon = nrSalon;
        this.nrPaturi = nrPaturi;
        
    }
    
    public Salon() {
        
        listaSaloane = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            
            listaSaloane.add(i + 1);
            
        }
        
    }
    
    public boolean verificareSalon(int nrSalon) {
        
        return listaSaloane.contains(nrSalon);
        
    }
    
}