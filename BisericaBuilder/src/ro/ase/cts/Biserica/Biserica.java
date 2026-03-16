package to.ase.cts.Biserica;

public class Biserica {
    
    private String nume;
    private String locatie;
    
    private Biserica(String nume, String locatie) {
        
        this.nume = nume;
        this.locatie = locatie;
        
    }
    
    public static class Biserica implements BuilderAbstract {
        
        private String nume;
        private String locatie;
        
        @Override
        public BuilderAbstract setNume(String nume) {
            
            this.nume = nume;
            return this;
            
        }
        
        @Override
        public BuilderAbstract setLocatie(String locatie) {
            
            this.locatie = locatie;
            return this;
            
        }
        
        @Override
        public Biserica build() {
            
            return new Biserica(nume, locatie);
            
        }
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("Biserica{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", locatie='").append(locatie);
        sb.append('{');
        
        return sb.toString();
        
    }
    
}