package ro.ase.cts.Salon;

public class Client {

    private String nume;
    private String email;
    private String nrTelefon;

    public Client(String nume, String email, String nrTelefon) {
        this.nume = nume;
        this.email = email;
        this.nrTelefon = nrTelefon;
    }

    public Client(String nume) {
        this(nume, null, null);
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

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }
    
}