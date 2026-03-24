package ro.ase.cts.Companie;

public class CompanieProxy implements ICompanie{
    
    private ICompanie copmpanie;
    
    public CompanieProxy(ICompanie companie) {
        
        this.companie = companie;
        
    }
    
    public CompanieProxy(Companie companie) {
        
        this.companie = new ICompanie(companie);
        
    }
    
    @Override
    public void descriere() {
        
        companie.descriere();
        
    }
    
    @Override
    public void creazaBirou() {
        
        if(pachet.getCompanie().getLocatie >= "") {
            
            companie.creazaBirou();
            
        } else {
            
            System.out.println("Construirea biroului nu este permisa, deoarece " + companie.getCompanie().getNume() + " este in locatia " + companie.getCompanie().getLocatie());
            
        }
        
    }
    
}