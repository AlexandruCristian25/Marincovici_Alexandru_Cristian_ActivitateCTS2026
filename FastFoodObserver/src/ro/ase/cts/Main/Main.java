package ro.ase.cts.FastFood;

public class Main {

    public static void main(String[] args) {
        
        Aplicatie aplicatie = new Aplicatie("FastFood App");

        Client client1 = new Client("Mihai");
        Client client2 = new Client("Ana");

        aplicatie.adaugaObserver(client1);
        aplicatie.adaugaObserver(client2);

        aplicatie.notificareNoua();
        aplicatie.notificareReduceri();
        
    }
    
}