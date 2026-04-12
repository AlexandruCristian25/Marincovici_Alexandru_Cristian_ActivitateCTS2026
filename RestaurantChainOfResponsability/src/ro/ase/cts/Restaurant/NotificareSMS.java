package ro.ase.cts.Restaurant;

public class NotificareSMS extends Notificare {
    
    @Override
    public void notifica(Persoana persoana, String mesaj) {
        
        if(persoana.getNrTelefon() != null) {
            
            System.out.println(persoana.getNume() + " a primit un SMS cu mesajul " + mesaj);
            
        } else {
            
            if(super.getNotificareNoua() != null) {
                
                super.getNotificareNoua().notifica(persoana, mesaj);
                
            }
            
        }
        
    }
    
}