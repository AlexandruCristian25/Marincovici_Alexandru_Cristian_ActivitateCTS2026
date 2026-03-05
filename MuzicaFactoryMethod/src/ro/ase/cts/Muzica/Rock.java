package ro.ase.cts.Muzica;

public class Rock extends Muzica {

    public Rock(String titlu, String artist) {
        super(titlu, artist);
    }

    @Override
    public void descriereGen() {
        System.out.println("Gen muzical: Rock - " + titlu);
    }
}
