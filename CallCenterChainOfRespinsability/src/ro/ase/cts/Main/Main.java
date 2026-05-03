package ro.ase.cts.CallCenter;

public class Main {
    public static void main(String[] args) {
        Client clientCuTelefon = new Client("Andrei", "0712345678");
        Client clientFaraTelefon = new Client("Maria");

        Notificare sms = new NotificareSMS();
        Notificare operator = new NotificareOperator();
        sms.setNotificareNoua(operator);

        sms.notifica(clientCuTelefon, "Comanda ta a fost procesata.");
        sms.notifica(clientFaraTelefon, "Te rugam sa contactezi suportul.");
    }
}
