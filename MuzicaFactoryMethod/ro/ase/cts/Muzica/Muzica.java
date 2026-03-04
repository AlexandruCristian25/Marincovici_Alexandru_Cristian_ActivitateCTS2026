package ro.ase.cts.Muzica;

public abstract class Muzica {
    protected String titlu;
    protected String artist;

    public Muzica(String titlu, String artist) {
        this.titlu = titlu;
        this.artist = artist;
    }

    public abstract void descriereGen();

    @Override
    public String toString() {
        return "Muzica{" +
                "titlu='" + titlu + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
