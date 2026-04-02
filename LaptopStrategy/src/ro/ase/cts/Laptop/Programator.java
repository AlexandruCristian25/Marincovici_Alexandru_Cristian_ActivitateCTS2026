package ro.ase.cts.Laptop;

public class Programator {
    
    private String numeProgramator;
    private ILaptop tipLaptop;
    
    public Programator(String numeProgramator, ILaptop tipLaptop) {
        super();
        this.numeProgramator = numeProgramator;
        this.tipLaptop = tipLaptop;
    }
    
    public Programator(String numeProgramator) {
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
    
    public ILaptop getTipLaptop() {
        return tipLaptop;
    }
    
    public void setTipLaptop(ILaptop tipLaptop) {
        this.tipLaptop = tipLaptop;
    }
    
    public void utilizeaza(int RAM) {
        tipLaptop.utilizeaza(numeProgramator, RAM);
    }
    
}