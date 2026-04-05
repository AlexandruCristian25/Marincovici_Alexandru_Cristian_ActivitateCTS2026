package ro.ase.cts.Aplicatie;

public class Utilizator {
    
    private String mesaj;
    private String numeUtilizator;
    
    public String getMesaj() {
        return mesaj;
    }
    
    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
    
    public Utilizator(String mesaj) {
        super();
        this.mesaj = mesaj;
    }
    
    @Override
    public String toString() {
        return "Utilizator [mesaj=" + mesaj + "]";
    }
    
    public AplicatieMemento salvareMemento() {
        return new AplicatieMemento(mesaj);
    }
    
    public void undoToMemento(AplicatieMemento memento) {
        this.mesaj = memento.getMesaj();
    }
    
}