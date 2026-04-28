package ro.ase.cts.Main;

import ro.ase.cts.Salon.Client;
import ro.ase.cts.Salon.Notificare;
import ro.ase.cts.Salon.NotificareEmail;
import ro.ase.cts.Salon.NotificareSMS;

public class Main {
    public static void main(String[] args) {
        Notificare notificareEmail = new NotificareEmail();
        Notificare notificareSMS = new NotificareSMS();

        notificareEmail.setNotificareNoua(notificareSMS);
        notificareSMS.setNotificareNoua(null);

        Client client = new Client("Mihai", null, "0712345678");
        notificareEmail.notifica(client, "Primire notificare");
        
    }
    
}