package ro.ase.cts.Telefon;

public class RezervareTelefon {

    private String marcaTelefon;
    private double pret;
    private String numeClient;

    private RezervareTelefon(String marcaTelefon, double pret, String numeClient) {
        
        this.marcaTelefon = marcaTelefon;
        this.pret = pret;
        this.numeClient = numeClient;
        
    }

    public static class Builder implements BuilderAbstract {

        private String marcaTelefon;
        private double pret;
        private String numeClient;

        @Override
        public BuilderAbstract setMarcaTelefon(String marcaTelefon) {
            
            this.marcaTelefon = marcaTelefon;
            return this;
            
        }

        @Override
        public BuilderAbstract setPret(double pret) {
            
            this.pret = pret;
            return this;
            
        }

        @Override
        public BuilderAbstract setNumeClient(String numeClient) {
            
            this.numeClient = numeClient;
            return this;
            
        }

        @Override
        public RezervareTelefon build() {
            
            return new RezervareTelefon(marcaTelefon, pret, numeClient);
            
        }
        
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareTelefon{");
        sb.append("marcaTelefon='").append(marcaTelefon).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
        
    }
    
}