package ro.ase.cts.Fruct;

public class FructBuilder {
    
    private String numeFrunct;
    private double greutate;
    private String culoare;
    
    private FructBuilder(String numeFruct, double greutate, String culoare) {
        
        this.numeFruct = numeFruct;
        this.greutate = greutate;
        this.culoare = culoare;
        
    }
    
    public static class FructBuilder implements BuilderAbstract {
        
        private String numeFrunct;
        private double greutate;
        private String culoare;
        
        @Override
        public BuilderAbstract setNumeFruct(String numeFruct) {
            
            this.numeFruct = numeFruct;
            return this;
            
        }
        
        @Override
        public BuilderAbstract setGreutate(double greutate) {
            
            this.greutate = greutate;
            return this;
            
        }
        
        @Override
        public BuilderAbstract setCuloare(String culoare) {
            
            this.culoare = culoare;
            return this;
            
        }
        
        @Override
        public FructBuilder build() {
            
            return new FructBuilder(numeFruct, greutate, culoare);
            
        }
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("Fruct{");
        sb.append("numeFruct='").append(numeFruct).append('\'');
        sb.append(", greutate='").append(greutate).append('\'');
        sb.append(", culoare='").append(culoare);
        sb.append('{');
        
        return sb.toString();
        
    }
    
}