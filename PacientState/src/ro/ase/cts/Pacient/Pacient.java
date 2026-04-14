package ro.ase.cts.Pacient;

public class Pacient {
    
    private String nume;
    private Stare stare;
    
    public Pacient(String nume) {
        super();
        this.nume = nume;
        this.stare = new Internat();
    }
    
    public void internarePacient() {
        
        if(!(this.stare instanceof Internat)) {
            
            System.out.println("Pacientul " + nume + " a fost internat");
            stare = new Internat();
            
        } else {
            
            System.out.println("Pacientul " + nume + " este deja internat");
            
        }
        
    }
    
    public void subObservatiePacient() {
        
        if(!(this.stare instanceof SubObservatie)) {
            
            System.out.println("Pacientul " + nume + " este pus sub observatie");
            stare = new SubObservatie();
            
        } else {
            
            System.out.println("Pacientul " + nume + " este deja sub observatie");
            
        }
        
    }
    
    public void externarePacient() {
        
        if(!(this.stare instanceof Externat)) {
            
            System.out.println("Pacientul " + nume + " a fost externat");
            stare = new Externat();
            
        } else {
            
            System.out.println("Pacientul " + nume + " este deja externat");
            
        }
        
    }
    
}