package ro.ase.cts.Restaurant;

public abstract class Notificare {
    
    private Notificare notificareNoua;
    
    public Notificare getNotificareNoua() {
        return notificareNoua;
    }
    
    public void setNotificareNoua(Notificare notificareNoua) {
        this.notificareNoua = notificareNoua;
    }
    
    public abstract void notifica(Persoana persoana, String mesaj);
    
}