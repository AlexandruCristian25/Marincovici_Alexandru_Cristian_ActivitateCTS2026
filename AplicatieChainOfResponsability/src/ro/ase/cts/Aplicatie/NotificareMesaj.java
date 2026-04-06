package ro.ase.cts.Aplicatie;

public class NotificareMesaj extends Notificare {
    
    @Override
    public void notifica(Utilizator utilizator, String mesaj) {
        
        if(utilizator.getEmail() != null) {
            
            System.out.println(utilizator.getNume() + " a primit un mesaj ce contine " + mesaj);
            
        } else {
            
            if(getNotificareNoua() != null) {
                
                getNotificareNoua().notifica(utilizator, mesaj);
                
            }
            
        }
        
    }
    
}