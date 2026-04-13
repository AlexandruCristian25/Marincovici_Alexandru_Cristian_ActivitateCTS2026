package ro.ase.cts.Biblioteca;

public abstract class Notificare {
    
    private Notificare notificare;
    
    public Notificare getNotificare() {
        return notificare;
    }
    
    public void setNotificare(Notificare notificare) {
        this.notificare = notificare;
    }
    
    public abstract void notifica(Student student, String mesaj);
    
}