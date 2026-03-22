package ro.ase.cts.Facultate;

public class Facultate {
    
    private String nume;
    private String locatie;
    private String specializare;
    
    private Facultate(String nume, String locatie, String specializare) {
        
        this.nume = nume;
        this.locatie = locatie;
        this.specializare = specializare;
        
    }
    
    public static class Builder implements BuilderAbstract {
        
        private String nume;
        private String locatie;
        private String specializare;

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
        public BuilderAbstract setSpecializare(String specializare) {
            
            this.specializare = specializare;
            return this;
            
        }

        @Override
        public Facultate build() {

            return new Facultate(nume, locatie, specializare);

        }
        
    } 
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("Facultate{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", locatie='").append(locatie).append('\'');
        sb.append(", specializare='").append(specializare);
        sb.append('}');
        
        return sb.toString();
        
    }
    
}