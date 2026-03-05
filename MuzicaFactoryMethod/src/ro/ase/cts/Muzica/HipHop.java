package ro.ase.cts.Muzica;

public class HipHop extends Muzica {

    public HipHop(String titlu, String artist) {
        super(titlu, artist);
    }

    @Override
    public void descriereGen() {
        System.out.println("Gen muzical: Hip Hop - " + titlu);
    }
}
