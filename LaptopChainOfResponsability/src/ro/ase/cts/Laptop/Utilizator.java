package ro.ase.cts.Laptop;

public class Utilizator {

    private String nume;
    private String email;

    public Utilizator(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    public Utilizator(String nume) {
        this.nume = nume;
        this.email = null;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
