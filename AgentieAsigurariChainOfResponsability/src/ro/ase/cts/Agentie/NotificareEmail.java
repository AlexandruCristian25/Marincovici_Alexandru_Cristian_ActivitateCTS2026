package ro.ase.cts.Agentie;

public class NotificareEmail extends Notificare {
    
    @Override
    public void notificare(Persoana persoana, String mesaj) {
        
        if(persoana.getEmail() != null) {
            
            System.out.println("Persoana " + persoana.getNume() + " a primit un email cu mesajul: " + mesaj);
            
        } else {
            
            if(super.getNotificarePrimita() != null) {
                
                super.getNotificarePrimita().notificare(persoana, mesaj);
                
            }
            
        }
        
    }
    
}