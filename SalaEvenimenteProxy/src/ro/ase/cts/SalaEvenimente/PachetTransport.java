package ro.ase.cts.SalaEvenimente;

public class PachetTransport implements PachetEveniment {

    private Persoana persoana;

    public Persoana getPersoana() {
        return persoana;
    }

    public void setPersoana(Persoana persoana) {
        this.persoana = persoana;
    }

    public PachetTransport(Persoana persoana) {
        this.persoana = persoana;
    }

    @Override
    public void info() {
        System.out.println("Pachetul contine transport");
    }

    @Override
    public void rezervarePachet() {
        System.out.println(persoana.getNume() + " a rezervat pachetul");
    }
    
}