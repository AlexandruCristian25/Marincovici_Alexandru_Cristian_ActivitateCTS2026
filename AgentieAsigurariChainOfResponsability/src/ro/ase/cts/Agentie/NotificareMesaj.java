package ro.ase.cts.Agentie;

public class NotificareMesaj extends Notificare {
    
    @Override
    public void notificare(Persoana persoana, String mesaj) {
        
        if(persoana.getNrTelefon() != null) {
            
            System.out.println("Persoana " + persoana.getNume() + " a primit un SMS cu mesajul: " + mesaj);
            
        } else {
            
            if(super.getNotificarePrimita() != null) {
                super.getNotificarePrimita().notificare(persoana, mesaj);
                
            }
            
        }
        
    }
    
}