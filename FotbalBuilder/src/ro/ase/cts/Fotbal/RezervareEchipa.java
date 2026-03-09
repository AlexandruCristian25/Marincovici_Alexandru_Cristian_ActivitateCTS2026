package ro.ase.cts.Fotbal;

public class RezervareEchipa {
    
    private String numeEchipa;
    private int nrJucatori;
    
    private RezervareEchipa(String numeEchipa, int nrJucatori) {
        
        this.numeEchipa = numeEchipa;
        this.nrJucatori = nrJucatori;
        
    }
    
    public static class RezervareEchipa implements BuilderAbstract {
        
        private String numeEchipa;
        private int nrJucatori;
        
        @Override
        public BuilderAbstract setNumeEchipa(String numeEchipa) {
            
            this.numeEchipa = numeEchipa;
            return this;
            
        }
        
        @Override
        public BuilderAbstract setNrJucatori(int nrJucatori) {
            
            this.nrJucatori = nrJucatori;
            return this;
            
        }
        
        @Override
        public RezervareEchipa build() {
            
            return new RezervareEchipa(numeEchipa, nrJucatori);
            
        }
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("RezervareEchipa{");
        sb.append("numeEchipa='").append(numeEchipa).append('\'');
        sb.append(", nrJucatori='").append(nrJucatori).append('\'');
        sb.append('{');
        
        return sb.toString();
        
    }
    
}