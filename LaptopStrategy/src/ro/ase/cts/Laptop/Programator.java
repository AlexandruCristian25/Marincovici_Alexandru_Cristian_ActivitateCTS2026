package ro.ase.cts.Laptop;

public class Programator {
    
    private String numeProgramator;
    private TipLaptop tipLaptop;
    
    public Laptop(String numeProgramator, TipLaptop tipLaptop) {
        
        super();
        this.numeProgramator = numeProgramator;
        this.tipLaptop = tipLaptop;
        
    }
    
    public Laptop(String numeProgramator) {
        
        super();
        this.numeProgramator = numeProgramator;
        this.tipLaptop = new LaptopGaming();
        
    }
    
    public String getNumeProgramator() {
        
        return numeProgramator;
        
    }
    
    public void setNumeProgramator(String numeProgramator) {
        
        this.numeProgramator = numeProgramator;
        
    }
    
    public getTipLaptop() {
        
        return tipLaptop;
        
    }
    
    public void setTipLaptop(TipLaptop tipLaptop) {
        
        this.tipLaptop = tipLaptop;
        
    }
    
}