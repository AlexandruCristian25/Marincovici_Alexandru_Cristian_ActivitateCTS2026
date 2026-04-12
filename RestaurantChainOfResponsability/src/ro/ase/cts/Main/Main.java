package ro.ase.cts.Main;

import ro.ase.cts.Restaurant.Persoana;
import ro.ase.cts.Restaurant.Notificare;
import ro.ase.cts.Restaurant.NotificareSMS;
import ro.ase.cts.Restaurant.NotificarePersoana;

public class Main {
    public static void main(String[] args) {
        
        Notificare notificareSMS = new NotificareSMS();
        Notificare notificarePersoana = new NotificarePersoana();
        
        notificareSMS.setNotificareNoua(notificarePersoana);
        
        Persoana persoana = new Persoana("Valentina", null, 25);
        
        notificareSMS.notifica(persoana, "Notificare noua");
        
    }
    
}