package ro.ase.cts.Companie;

public class CompanieProxy implements ICompanie {
    
    private TipCompanie companie;
    
    public CompanieProxy(Companie companie) {
        this.companie = new TipCompanie(companie);
    }
    
    @Override
    public void descriere() {
        companie.descriere();
    }
    
    @Override
    public void creazaBirou() {
        if (companie.getCompanie().getLocatie() != null && 
            !companie.getCompanie().getLocatie().isEmpty()) {
            
            companie.creazaBirou();
            
        } else {
            System.out.println("Construirea biroului nu este permisa, deoarece " 
                + companie.getCompanie().getNume() 
                + " este in locatia " 
                + companie.getCompanie().getLocatie());
        }
        
    }
    
}