package ro.ase.cts.Main;

import ro.ase.cts.Cafenea.Client;
import ro.ase.cts.Cafenea.Notificare;
import ro.ase.cts.Cafenea.NotificareSMS;

public class Main {
    public static void main(String[] args) {
        
        Notificare notificareSMS = new NotificareSMS();
        notificareSMS.setNotificareNoua(null);
        
        Client client = new Client("Alexandra", null);
        
        notificareSMS.notifica(client, "Primire mesaj");
        
    }
    
}