package ro.ase.cts.Fabrica;

public class Muncitor implements Observer {
    
    private String nume;
    
    public Muncitor(String nume) {
        
        this.nume = nume;
        
    }
    
    @Override
    public void primireMesaj(String mesaj) {
        
        System.out.println(nume + " a primit un email ce contine mesajul: " + mesaj);
        
    }
    
}