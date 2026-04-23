package ro.ase.cts.Vapor;

public class RezervareLoc {
    
    private String numePersoana;
    private double pret;
    
    public RezervareLoc(String numePersoana, double pret) {
        super();
        this.numePersoana = numePersoana;
        this.pret = pret;
    }
    
    @Override
    public String toString() {
        return "RezervareLoc [numePersoana=" + numePersoana + ", pret=" + pret + "]";
    }
    
}