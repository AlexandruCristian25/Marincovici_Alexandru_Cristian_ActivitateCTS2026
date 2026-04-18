package ro.ase.cts.Cafenea;

public class NotificareSMS extends Notificare {
    
    @Override
    public void notifica(Client client, String mesaj) {
        
        if (client.getNrTelefon() != null) {
            
            System.out.println(client.getNume() + " are un SMS cu mesajul " + mesaj);
            
        } else {
            
            if (super.getNotificareNoua() != null) { 
                
                super.getNotificareNoua().notifica(client, mesaj);
                
            } else {
                
                System.out.println("Nu exista metoda de notificare disponibila");
                
            }
            
        }
        
    }
    
}