package ro.ase.cts.Bilet;

public class BiletDecorat extends Decorator {

    public BiletDecorat(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void afisareBilet() {
        super.afisareBilet();
        System.out.println("Biletul include acces VIP");
    }
    
}