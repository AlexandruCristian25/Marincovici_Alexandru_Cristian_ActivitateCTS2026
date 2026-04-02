package ro.ase.cts.Joc;

public class RezervareJoc extends BuilderAbstract {

    private boolean scut;
    private boolean arma;
    private boolean magie;

    public RezervareJoc() {
        this.scut = false;
        this.arma = false;
        this.magie = false;
    }

    @Override
    public RezervareJoc adaugaScut() {
        this.scut = true;
        return this;
    }

    @Override
    public RezervareJoc adaugaArma() {
        this.arma = true;
        return this;
    }

    @Override
    public RezervareJoc adaugaMagie() {
        this.magie = true;
        return this;
    }

    @Override
    public RezervareJoc build() {
        return this;
    }

    @Override
    public String toString() {
        return "RezervareJoc{" +
                "scut=" + scut +
                ", arma=" + arma +
                ", magie=" + magie +
                '}';
    }
    
}