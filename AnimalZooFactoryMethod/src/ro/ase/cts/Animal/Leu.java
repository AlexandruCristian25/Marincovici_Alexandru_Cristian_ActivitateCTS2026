package ro.ase.cts.Animal;

public class Leu extends Animal {
    
    public Leu(String nume, int nrExemplare) {
        
        super(nume, nrExemplare);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nume animal: ").append(super.nume);
        sb.append("Nr exemplare: ").append(super.nrExemplare);
        
        System.out.println(sb.toString());
        
    }
    
}
