
package ro.ase.cts.Aeroport;

public class Bilet {

    private String numePasager;
    private double pret;
    private int nrLoc;

    private Bilet(String numePasager, double pret, int nrLoc) {
        this.numePasager = numePasager;
        this.pret = pret;
        this.nrLoc = nrLoc;
    }

    public static class Builder implements BuilderAbstract {

        private String numePasager;
        private double pret;
        private int nrLoc;

        @Override
        public BuilderAbstract setNumePasager(String numePasager) {
            this.numePasager = numePasager;
            return this;
        }

        @Override
        public BuilderAbstract setPret(double pret) {
            this.pret = pret;
            return this;
        }

        @Override
        public BuilderAbstract setNrLoc(int nrLoc) {
            this.nrLoc = nrLoc;
            return this;
        }

        @Override
        public Bilet build() {
            return new Bilet(numePasager, pret, nrLoc);
        }
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "numePasager='" + numePasager + '\'' +
                ", pret=" + pret +
                ", nrLoc=" + nrLoc +
                '}';
    }
}
