package ro.ase.cts.Laptop;

public class NotificareEmail extends Notificare {

    @Override
    public void notifica(Utilizator utilizator, String mesaj) {

        if (utilizator.getEmail() != null) {

            System.out.println(utilizator.getNume() + " are un email cu mesajul: " + mesaj);

        } else if (super.getNotificare() != null) {

            super.getNotificare().notifica(utilizator, mesaj);

        } else {

            System.out.println("Utilizatorul nu are email pentru notificare.");

        }
    }
}
