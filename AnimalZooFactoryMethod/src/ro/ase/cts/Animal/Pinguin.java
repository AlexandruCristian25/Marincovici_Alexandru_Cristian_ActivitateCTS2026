package ro.ase.cts.Animal;

public class Pinguin extends Animal {
    
    public Pinguin(String nume, int nrExemplare) {
        
        super(nume, nrExemplare);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Nume animal " + nume + "cu un numar de exemplare de " + nrExemplare);
        
    }
    
}