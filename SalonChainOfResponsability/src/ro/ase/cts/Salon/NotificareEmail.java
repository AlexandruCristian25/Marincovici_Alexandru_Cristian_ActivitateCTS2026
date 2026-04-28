package ro.ase.cts.Salon;

public class NotificareEmail extends Notificare {

    @Override
    public void notifica(Client client, String mesaj) {
        
        if (client.getEmail() != null && !client.getEmail().isEmpty()) {
            
            System.out.println(client.getNume() + " a primit un email cu mesajul: " + mesaj);
            
        } else if (super.getNotificareNoua() != null) {
            
            super.getNotificareNoua().notifica(client, mesaj);
        
        } else {
            
            System.out.println("Nu exista metoda de notificare disponibila pentru " + client.getNume());
            
        }
        
    }
    
}