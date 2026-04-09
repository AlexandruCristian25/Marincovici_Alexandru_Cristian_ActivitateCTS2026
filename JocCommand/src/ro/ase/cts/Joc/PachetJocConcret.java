package ro.ase.cts.Joc;

public class PachetJocConcret implements PachetJoc {

    private int nrJucatori;

    public PachetJocConcret(int nrJucatori) {
        this.nrJucatori = nrJucatori;
    }

    @Override
    public void rezerva() {
        System.out.println("S-a facut rezervarea pentru " + nrJucatori + " jucatori");
    }

    @Override
    public void vanzare() {
        System.out.println("S-a realizat vanzarea pentru " + nrJucatori + " jucatori");
    }
    
}