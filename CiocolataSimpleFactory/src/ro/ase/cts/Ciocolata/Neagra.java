package ro.ase.cts.Ciocolata;

public class Neagra extends Ciocolata {
    
    public Neagra(String nume, double pret) {
        
        super(nume, pret);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nume ciocolata: ").append(super.nume);
        sb.append("Pret: ").append(super.pret);
        
        System.out.println(sb.toString());
        
    }
    
}