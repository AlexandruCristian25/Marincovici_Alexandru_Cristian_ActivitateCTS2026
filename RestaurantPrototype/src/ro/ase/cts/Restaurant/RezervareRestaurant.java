package ro.ase.cts.Restaurant;

public class RezervareRestaurant {
    
    private String nume;
    private int nrPersoane;
    private int nrMasa;
    
    private RezervareRestaurant() {
    }
    
    public RezervareRestaurant(String nume, int nrPersoane, int nrMasa) {
        
        if(nume.length() > 3) {
            
            this.nume = nume;
            
        } else {
            
            this.nume = "NaN";
            
        }
        
        if(nrPersoane.length() > 1) {
            
            this.nrPersoane = nrPersoane;
            
        } else {
            
            this.nrPersoane = "0";
            
        }
        
        if(nrMasa.length() == 0) {
            
            this.nrMasa = nrMasa;
            
        }
        
    }
    
    public void setNrMasa(int nrMasa) {
        
        this.nrMasa = nrMasa;
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("RezervareRestaurant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane='").append(nrPersoane).append('\'');
        sb.append(", nrMasa='").append(nrMasa);
        sb.append('{');
        
        return sb.toString();
        
    }
    
    public RezervareRestaurant copiaza() throws CloneNotSupportedException {
        
        return (RezervareRestaurant) super.clone();
        
    }
    
}