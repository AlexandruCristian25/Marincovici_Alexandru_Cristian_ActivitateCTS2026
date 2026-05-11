package ro.ase.cts.Fabrica;

public class NotificareManager extends Notificator {

    @Override
    public void notifica(Muncitor muncitor, String mesaj) {

        System.out.println("Managerul a trimis un mesaj angajatului " + muncitor.getNume()
                + " cu mesajul: " + mesaj);

    }

}
