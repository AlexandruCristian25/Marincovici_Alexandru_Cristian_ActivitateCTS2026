package ro.ase.cts.Aplicatie;

public class AplicatieMobila implements IAplicatieMobila {

    private Aplicatie aplicatie;

    public AplicatieMobila(Aplicatie aplicatie) {
        this.aplicatie = aplicatie;
    }

    @Override
    public void descriere() {
        System.out.println("Aplicatie mobila: " + aplicatie.getNume());
    }

    @Override
    public void creeazaSoftware() {
        System.out.println("Se creeaza aplicatia mobila cu dimensiunea: " + aplicatie.getDimensiune());
    }
}
