package ro.ase.cts.Jucator;

public class Portar extends Jucator {
    
    public Portar(String nume, int nrMeciuri) {
        
        super(nume, nrMeciuri);
        
    }
    
    @Override
    public void afiseazaInfo() {

        StringBuilder sb = new StringBuilder();
        sb.append("Nume : ").append(nume);
        sb.append("Nr meciuri: ").append(nrMeciuri);

        System.out.println(sb.toString());
        
    }
    
}