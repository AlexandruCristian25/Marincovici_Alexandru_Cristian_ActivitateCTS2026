package ro.ase.cts.Dictionar;

public class Englez extends Dictionar {
    
    public Englez(String editura, double pret) {
        
        super(editura, pret);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Editura dictionar: ").append(super.editura);
        sb.append("Pret: ").append(super.pret);
        
        System.out.println(sb.toString());
        
    }
    
}