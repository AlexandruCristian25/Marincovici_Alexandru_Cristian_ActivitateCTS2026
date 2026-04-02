package ro.ase.cts.Companie;

public class TipCompanie implements ICompanie {
    
    private Companie companie;
    
    public TipCompanie(Companie companie) {
        this.companie = companie;
    }
    
    public Companie getCompanie() {
        return companie;
    }
    
    @Override
    public void descriere() {
        System.out.println("Compania este la locatia " + companie.getLocatie());
    }
    
    @Override
    public void creazaBirou() {
        System.out.println(companie.getNume() + " a construit un nou birou");
    }
    
}