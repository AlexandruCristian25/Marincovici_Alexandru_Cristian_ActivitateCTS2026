package ro.ase.cts.Restaurant;

public class NotificarePersoana extends Notificare {
    
    @Override
    public void notifica(Persoana persoana, String mesaj) {
        
        System.out.println("Masa a fost rezervata pentru " + persoana.getNume());
        
    }
    
}