package ro.ase.cts.Sejur;

public class Client implements Observer {
    
    private String numeClient;
    
    public Client(String nume) {
        
        this.numeClient = nume;
        
    }
    
    @Override
    public void receptionareMesaj(String mesaj) {
        
        System.out.println(numeClient + " a primit mesajul: " + mesaj);
        
    }
    
}