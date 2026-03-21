package ro.ase.cts.Concert;

public class RezervareLoc {
    
    private String locatie;
    private double pretBilet;
    private int nrLoc;
    
    private RezervareLoc(String locatie, double pretBilet, int nrLoc) {
        
        this.locatie = locatie;
        this.pretBilet = pretBilet;
        this.nrLoc = nrLoc;
        
    }
    
    public static class RezervareLoc implements BuilderAbstract {
        
        private String locatie;
        private double pretBilet;
        private int nrLoc;
        
        @Override
        public BuilderAbstract setLocatie(String locatie) {
            
            this.locatie = locatie;
            return this;
            
        }
        
        @Override
        public BuilderAbstract setPretBilet(double pretBilet) {
            
            this.pretBilet = pretBilet;
            return this;
            
        }
        
        @Override
        public BuilderAbstract setNrLoc(int nrLoc) {
            
            this.nrLoc = nrLoc;
            return this;
            
        }
        
        @Override
        public RezervareLoc build() {
            
            return new RezervareLoc(locatie, pretBilet, nrLoc);
            
        }
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("RezervareLoc{");
        sb.append("locatie='").append(locatie).append('\'');
        sb.append(", pretBilet='").append(pretBilet).append('\'');
        sb.append(", nrLoc='").append(nrLoc);
        sb.append('{');
        
        return sb.toString();
        
    }
    
}