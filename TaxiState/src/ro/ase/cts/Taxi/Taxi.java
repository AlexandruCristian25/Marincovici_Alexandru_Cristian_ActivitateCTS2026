package ro.ase.cts.Taxi;

public class Taxi {
    
    private int ora;
    private Stare stare;
    
    public Taxi(int ora) {
        super();
        this.ora = ora;
        stare = new SchimbaOra();
    }
    
    public void schimbaOra() {
        
        if(this.stare instanceof SchimbaOra) {
            
            System.out.println("Taxiul de la ora " + ora + " soseste la destinatie");
            
        } else {
            
            System.out.println("Taxiul de la ora " + ora + " este pe drum");
            
        }
        
    }
    
    public void rezervareTaxi() {
        
        if(!(stare instanceof Rezervare)) {
            
            stare = new Rezervare();
            System.out.println("Taxiul de la ora " + ora + " este rezervat");
            
        } else {
            
            System.out.println("Taxiul de la ora " + ora + " nu este rezervat");
            
        }
        
    }
    
    public void eliberareTaxi() {
        
        if(!(stare instanceof Eliberare)) {
            
            stare = new Eliberare();
            System.out.println("Taxiul de la ora " + ora + " este eliberat");
            
        } else {
            
            System.out.println("Taxiul de la ora " + ora + " este deja liber");
            
        }
        
    }
    
}