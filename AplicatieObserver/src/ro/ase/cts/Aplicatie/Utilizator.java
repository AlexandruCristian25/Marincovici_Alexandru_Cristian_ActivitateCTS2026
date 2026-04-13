package ro.ase.cts.Aplicatie;

public class Utilizator implements Observer {
    
    private String numeUtilizator;
    
    public Utilizator(String nume) {
        
        this.numeUtilizator = nume;
        
    }
    
    @Override
    public void primireMesaj(String mesaj) {
        
        System.out.println(numeUtilizator + " a primit mesajul: " + mesaj);
        
    }
    
}