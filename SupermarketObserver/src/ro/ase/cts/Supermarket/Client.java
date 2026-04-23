package ro.ase.cts.Supermarket;

public class Client implements Observer {
    
    private String numeClient;
    
    public Client(String nume) {
        this.numeClient = nume;
    }
    
    @Override
    public void primireMesaj(String mesaj) {
        System.out.println(numeClient + " a primit notificare: " + mesaj);
    }
    
}