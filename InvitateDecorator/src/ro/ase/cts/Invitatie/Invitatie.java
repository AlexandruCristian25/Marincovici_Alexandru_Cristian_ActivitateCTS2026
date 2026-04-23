package ro.ase.cts.Invitatie;

public class Invitatie implements IInvitatie {
    
    private int cod;
    private double suma;
    
    public Invitatie(int cod, double suma) {
        this.cod = cod;
        this.suma = suma;
    }
    
    public int getCod() {
        return cod;
    }
    
    public void setCod(int cod) {
        this.cod = cod; 
    }
    
    public double getSuma() {
        return suma;
    }
    
    public void setSuma(double suma) {
        this.suma = suma; 
    }
    
    @Override
    public void printareInvitatie() {
        System.out.println("Invitatia cu codul " + cod + " are suma de " + suma);
    }
    
}