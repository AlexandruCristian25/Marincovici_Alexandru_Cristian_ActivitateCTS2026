package ro.ase.cts.SalaEvenimente;

public class ProxyPachet implements PachetEveniment {

    private PachetEveniment eveniment;

    public ProxyPachet(PachetEveniment eveniment) {
        this.eveniment = eveniment;
    }

    public ProxyPachet(Persoana persoana) {
        this.eveniment = new PachetTransport(persoana);
    }

    @Override
    public void info() {
        eveniment.info();
    }

    @Override
    public void rezervarePachet() {

        if (eveniment.getPersoana().getData() >= 10) {

            eveniment.rezervarePachet();

        } else {

            System.out.println("Rezervare nepermisa, persoana " 
                + eveniment.getPersoana().getNume() 
                + " este facuta pe data de " 
                + eveniment.getPersoana().getData());

        }

    }

    @Override
    public Persoana getPersoana() {
        return eveniment.getPersoana();
    }
    
}