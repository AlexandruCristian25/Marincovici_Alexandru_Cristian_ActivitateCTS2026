package ro.ase.cts.Ciocolata;

public class Alba extends Ciocolata {
    
    public Alba(String nume, double pret) {
        
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