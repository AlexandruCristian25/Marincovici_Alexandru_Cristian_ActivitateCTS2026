package ro.ase.cts.CallCenter;

public class NotificareSMS extends Notificare {
    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getNrTelefon() != null && !client.getNrTelefon().isBlank()) {
            System.out.println(client.getNume() + " a primit un SMS cu mesajul: " + mesaj);
        } else if (super.getNotificareNoua() != null) {
            super.getNotificareNoua().notifica(client, mesaj);
        } else {
            System.out.println("Nu exista metoda disponibila de notificare pentru clientul " + client.getNume());
        }
    }
}
