package ro.ase.cts.Aplicatie;

public abstract class Notificare {
    
    private Notificare notificareNoua;
    
    public Notificare getNotificareNoua() {
        return notificareNoua;
    }
    
    public void setNotificareNoua(Notificare notificare) {
        this.notificareNoua = notificare;
    }
    
    public abstract void notifica(Utilizator utilizator, String mesaj);
    
}