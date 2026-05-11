package ro.ase.cts.Fabrica;

public abstract class Notificator {
    
    private Notificator notificatorNou;
    
    public Notificator getNotificatorNou() {
        
        return notificatorNou;
        
    }
    
    public void setNotificatorNou(Notificator notificatorNou) {
        
        this.notificatorNou = notificatorNou;
        
    }
    
    public abstract void notifica(Muncitor muncitor, String mesaj);
    
}