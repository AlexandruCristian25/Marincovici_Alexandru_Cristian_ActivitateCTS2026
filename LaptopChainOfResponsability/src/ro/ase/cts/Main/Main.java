package ro.ase.cts.Main;

import ro.ase.cts.Laptop.Notificare;
import ro.ase.cts.Laptop.NotificareEmail;
import ro.ase.cts.Laptop.Utilizator;

public class Main {

    public static void main(String[] args) {

        Notificare notificareEmail = new NotificareEmail();
        notificareEmail.setNotificare(null);

        Utilizator utilizator = new Utilizator("Ionescu", "ionescu@email.com");
        notificareEmail.notifica(utilizator, "Test!");
    }
}
