package ro.ase.cts.Floare;

public class RezervareFloare implements Prototype {
    
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
    public Static toString() {
        
        final StringBuilder sb = new StringBuilder("RezervareFloare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", zi='").append(zi);
        sb.append('{');
        
        return sb.toString();
        
    }
    
    public RezervareFloare copiaza() throws CloneNotSupportedException {
        
        return (RezervareFloare) super.clone();
        
    }
    
}