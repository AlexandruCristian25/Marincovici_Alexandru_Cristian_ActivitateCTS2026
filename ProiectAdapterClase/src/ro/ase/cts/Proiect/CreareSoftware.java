package ro.ase.cts.Proiect;

public class CreareSoftware {
    
    private Software software;
    
    public CreareSoftware(Software software) {
        
        this.software = software;
        
    }
    
    public void creazaSoftware() {
        
        System.out.println("A fost creat software-ul" + software.toString());
        
    }
    
    @Override
    public String toString() {
        
        return "CreareSoftware [ software = " + software + "]";
        
    }
    
}