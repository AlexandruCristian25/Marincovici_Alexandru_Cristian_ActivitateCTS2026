package ro.ase.cts.CallCenter;

public class NotificareOperator extends Notificare {
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Operatorul a preluat notificarea pentru clientul " + client.getNume() + ": " + mesaj);
    }
}
