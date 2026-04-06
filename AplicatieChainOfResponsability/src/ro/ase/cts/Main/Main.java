package ro.ase.cts.Main;

import ro.ase.cts.Aplicatie.Utilizator;
import ro.ase.cts.Aplicatie.Notificare;
import ro.ase.cts.Aplicatie.NotificareEmail;
import ro.ase.cts.Aplicatie.NotificareUtilizator;
import ro.ase.cts.Aplicatie.NotificareMesaj;

public class Main {
    public static void main(String[] args) {
        
        Notificare notificareMesaj = new NotificareMesaj();
        Notificare notificareEmail = new NotificareEmail();
        Notificare notificareUtilizator = new NotificareUtilizator();
        
        notificareMesaj.setNotificareNoua(notificareEmail);
        notificareEmail.setNotificareNoua(notificareUtilizator);
        
        Utilizator utilizator = new Utilizator("Andreea", null, null);
        notificareMesaj.notifica(utilizator, "Notificare noua");
        
    }
    
}