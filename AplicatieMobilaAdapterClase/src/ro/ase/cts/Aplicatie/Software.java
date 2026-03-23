package ro.ase.cts.Aplicatie;

public class Software implements IAplicatie {
    
    @Override
    public void descriere() {
        
        System.out.println("Aceasta este o aplicatie");
        
    }
    
    @Override
    public void creeazaSoftware() {
        
        System.out.println("Sotfware-ul a fost creat")
        
    }
    
}