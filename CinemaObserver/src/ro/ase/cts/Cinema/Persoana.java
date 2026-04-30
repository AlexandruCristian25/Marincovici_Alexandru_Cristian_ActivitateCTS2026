package ro.ase.cts.Cinema;

public class Persoana implements Observer {
    
    private String numePersoana;
    
    public Persoana(String nume) {
        
        this.numePersoana = nume;
        
    }
    
    @Override
    public void trimiteMesaj(String mesaj) {
        
        System.out.println(numePersoana + " a primit mesajul " + mesaj);
        
    }
    
}