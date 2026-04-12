package ro.ase.cts.SalaEvenimente;

public class Persoana {

    private String nume;
    private int data;

    public Persoana(String nume, int data) {
        super();
        this.nume = nume;
        this.data = data;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Persoana [nume=" + nume + ", data=" + data + "]";
    }
}