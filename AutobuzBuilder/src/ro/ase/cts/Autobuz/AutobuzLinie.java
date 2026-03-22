package ro.ase.cts.Autobuz;

public class AutobuzLinie {
    
    private int linie;
    private String statie;

    private AutobuzLinie(int linie, String statie) {
        this.linie = linie;
        this.statie = statie;
    }

    public static class Autobuz implements BuilderAbstract {
        
        private int linie;
        private String statie;

        @Override
        public BuilderAbstract setLinie(int linie) {
            
            this.linie = linie;

            return null;
        }
        
        @Override
        public BuilderAbstract setStatie(String statie) {
            
            this.statie = statie;

            return null;
        }
        
        @Override
        public AutobuzLinie build() {
            
            return new AutobuzLinie(linie, statie);
            
        }
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("linie='").append(linie).append('\'');
        sb.append(", statie='").append(statie);
        sb.append('{');
        
        return sb.toString();
        
    }
    
}