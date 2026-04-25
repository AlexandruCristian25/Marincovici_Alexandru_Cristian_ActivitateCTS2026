package ro.ase.cts.Autobuz;

public class Autobuz {

    private String marca;
    private int nrLocuri;

    public Autobuz(String marca) {
        this(marca, 0);
    }

    public Autobuz(String marca, int nrLocuri) {
        this.marca = marca;
        this.nrLocuri = nrLocuri;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // pastrate pentru compatibilitate
    public String getNume() {
        return marca;
    }

    public void setNume(String nume) {
        this.marca = nume;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz [marca=" + marca + ", nrLocuri=" + nrLocuri + "]";
    }

    public AutobuzMemento salvareMemento() {
        return new AutobuzMemento(marca);
    }

    // alias pentru varianta gresita existenta
    public AutobuzMemento salavareMemento() {
        return salvareMemento();
    }

    public void undoToMemento(AutobuzMemento memento) {
        this.marca = memento.getMarca();
    }

    // alias pentru varianta gresita existenta
    public void undeToMemento(AutobuzMemento memento) {
        undoToMemento(memento);
    }
}
