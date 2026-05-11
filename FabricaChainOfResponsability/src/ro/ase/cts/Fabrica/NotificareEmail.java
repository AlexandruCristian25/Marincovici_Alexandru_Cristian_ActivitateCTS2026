package ro.ase.cts.Fabrica;

public class NotificareEmail extends Notificator {
    
    @Override
    public void notifica(Muncitor muncitor, String mesaj) {
        
        if(muncitor.getEmail() != null) {
            
            System.out.println(muncitor.getNume() + " a primit un email de la manager cu mesajul: " + mesaj);
            
        } else {
            
            super.getNotificatorNou().notifica(muncitor, mesaj);
            
        }
        
    }
    
}