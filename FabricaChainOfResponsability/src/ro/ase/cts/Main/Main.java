package ro.ase.cts.Main;

import ro.ase.cts.Fabrica.Muncitor;
import ro.ase.cts.Fabrica.NotificareEmail;
import ro.ase.cts.Fabrica.NotificareManager;
import ro.ase.cts.Fabrica.Notificator;

public class Main {
    public static void main(String[] args) {

        Notificator notificareEmail = new NotificareEmail();
        Notificator notificareManager = new NotificareManager();

        notificareEmail.setNotificatorNou(notificareManager);

        Muncitor muncitor = new Muncitor("Ionescu", null, null);
        notificareEmail.notifica(muncitor, "Test test!");

    }

}
