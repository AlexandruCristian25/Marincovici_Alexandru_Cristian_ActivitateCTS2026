package ro.ase.cts.Floare;

public class RezervareFloare implements Cloneable {
    
    private String nume;
    private String zi;
    
    private RezervareFloare() {
    }
    
    public RezervareFloare(String nume, String zi) {
        
        if(nume.length() > 3) {
            
            this.nume = nume;
            
        } else {
            
            this.nume = "NaN";
            
        }
        
        if(zi.length() == 0) {
            
            this.zi = zi;
            
        }
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("RezervareFloare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", zi='").append(zi);
        sb.append('}');
        
        return sb.toString();
        
    }
    
    public RezervareFloare copiaza() throws CloneNotSupportedException {
        
        return (RezervareFloare) super.clone();
        
    }

    public void setZi(String vineri) {

        this.zi = zi;

    }
}