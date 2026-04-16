package ro.ase.cts.Agentie;

public abstract class Notificare {
    
    private Notificare notificarePrimita;
    
    public Notificare getNotificarePrimita() {
        
        return notificarePrimita;
        
    }
    
    public void setNotificarePrimita(Notificare notificarePrimita) {
        
        this.notificarePrimita = notificarePrimita;
        
    }
    
    public abstract void notificare(Persoana persoana, String mesaj);
    
}