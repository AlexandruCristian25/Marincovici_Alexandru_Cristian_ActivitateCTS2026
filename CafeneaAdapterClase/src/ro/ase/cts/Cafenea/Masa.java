package ro.ase.cts.Cafenea;

public class Masa {

    private Client client;

    public Masa(Client client) {
        this.client = client;
    }

    public void rezervareMasa() {
        System.out.println("Clientul " + client.getNume() + " a rezervat masa");
    }

    @Override
    public String toString() {
        return "Masa [client=" + client + "]";
    }
}
