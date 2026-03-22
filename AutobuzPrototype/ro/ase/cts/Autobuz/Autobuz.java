package ro.ase.cts.Autobuz;

public class Autobuz implements Prototype {
    
    private String marca;
    private int nrLocuri;
    
    private Autobuz() {
        
    }
    
    public Autobuz(String marca, int nrLocuri) {
        
        if(marca.length() > 3) {
            
            this.marca = marca;
            
        } else {
            
            this.marca = "NaN";
            
        }
        
        if(nrLocuri == 0) {
            
            this.nrLocuri = nrLocuri;
            
        }
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", nrLocuri='").append(nrLocuri);
        sb.append('{');
        
        return sb.toString();
        
    }
    
    public Autobuz copiaza() throws CloneNotSupportedException {
        
        return (Autobuz) super.clone();
        
    }

    @Override
    public Prototype copie() {
        return null;
    }
}