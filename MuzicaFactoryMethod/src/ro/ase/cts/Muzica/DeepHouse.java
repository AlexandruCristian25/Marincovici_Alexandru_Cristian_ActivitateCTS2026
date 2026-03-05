package ro.ase.cts.Muzica;

public class DeepHouse extends Muzica {

    public DeepHouse(String titlu, String artist) {
        super(titlu, artist);
    }

    @Override
    public void descriereGen() {
        System.out.println("Gen muzical: Deep House - " + titlu);
    }
}
