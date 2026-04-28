package ro.ase.cts.FastFood;

public class Client implements Observer {

    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(numeClient + " a primit mesaj: " + mesaj);
    }
    
}