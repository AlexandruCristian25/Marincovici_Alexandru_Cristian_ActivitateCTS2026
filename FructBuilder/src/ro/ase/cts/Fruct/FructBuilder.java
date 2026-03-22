package ro.ase.cts.Fruct;

public class FructBuilder {
    
    private String numeFrunct;
    private double greutate;
    private String culoare;

    private FructBuilder(String numeFrunct, double greutate, String culoare) {
        this.numeFrunct = numeFrunct;
        this.greutate = greutate;
        this.culoare = culoare;
    }

    public static class FructBuilder1 implements BuilderAbstract {
        
        private String numeFrunct;
        private double greutate;
        private String culoare;
        
        @Override
        public BuilderAbstract setNumeFruct(String numeFruct) {
            
            this.numeFrunct = numeFruct;
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
            
            return new FructBuilder(numeFrunct, greutate, culoare);
            
        }
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("Fruct{");
        sb.append("numeFruct='").append(numeFrunct).append('\'');
        sb.append(", greutate='").append(greutate).append('\'');
        sb.append(", culoare='").append(culoare);
        sb.append('{');
        
        return sb.toString();
        
    }

    public static class Builder {
        public BuilderAbstract setCuloare(String rosu) {
            return null;
        }
    }
}