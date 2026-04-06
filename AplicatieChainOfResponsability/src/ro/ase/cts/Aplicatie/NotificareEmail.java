package ro.ase.cts.Aplicatie;

public class NotificareEmail extends Notificare {
    
    @Override
    public void notifica(Utilizator utilizator, String mesaj) {
        
        if(utilizator.getEmail() != null) {
            
            System.out.println(utilizator.getNume() + " are un e-mail cu mesajul " + mesaj);
            
        } else {
            
            if(getNotificareNoua() != null) {
                
                getNotificareNoua().notifica(utilizator, mesaj);
                
            }
            
        }
        
    }
    
}