package ro.ase.cts.Joc;

public class Facade {
    
    public static boolean verificareJoc(int pret) {
        
        JocAchizitionat joc = new JocAchizitionat();
        Producator producator = new Producator();
        
        if(joc.verificareJoc(pret) && producator.jocNou(pret)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String verificareDisponibilitateJoc(int pret) {
        
        JocAchizitionat joc = new JocAchizitionat();
        Producator producator = new Producator();
        
        if(joc.verificareJoc(pret) && producator.jocNou(pret)) {
            return "Joc nou";
        } else {
            return "Joc vechi";
        }
        
    }
}