package ro.ase.cts.Bilet;

public abstract class Decorator implements IBilet {

    protected IBilet bilet;

    public Decorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void afisareBilet() {
        bilet.afisareBilet();
    }
    
}