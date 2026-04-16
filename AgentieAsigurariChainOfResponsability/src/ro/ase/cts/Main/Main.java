package ro.ase.cts.Main;

import ro.ase.cts.Agentie.Persoana;
import ro.ase.cts.Agentie.Notificare;
import ro.ase.cts.Agentie.NotificareEmail;
import ro.ase.cts.Agentie.NotificareMesaj;

public class Main {
    public static void main(String[] args) {
        
        Notificare notificareEmail = new NotificareEmail();
        Notificare notificareSMS = new NotificareMesaj();
        
        notificareSMS.setNotificarePrimita(notificareEmail);
        notificareEmail.setNotificarePrimita(notificareSMS);
        
        Persoana persoana = new Persoana("Alexandra", null, null);
        notificareEmail.notificare(persoana, "Mesaj");
        
    }
    
}