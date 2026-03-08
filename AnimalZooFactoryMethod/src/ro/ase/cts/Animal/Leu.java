package ro.ase.cts.Animal;

public class Leu extends Animal {
    
    public Leu(String nume, int nrExemplare) {
        
        super(nume, nrExemplare);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Nume animal " + nume + "cu un numar de exemplare de " + nrExemplare);
        
    }
    
}