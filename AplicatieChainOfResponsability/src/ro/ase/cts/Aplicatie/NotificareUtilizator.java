package ro.ase.cts.Aplicatie;

public class NotificareUtilizator extends Notificare {
    
    @Override
    public void notifica(Utilizator utilizator, String mesaj) {
        
        System.out.println("Utilizatorul " + utilizator.getNume() + " a primit notificare");
        
    }
    
}