package ro.ase.cts.Aplicatie;

public class Software implements IAplicatieMobila {

    @Override
    public void descriere() {
        System.out.println("Aceasta este o aplicatie software");
    }

    @Override
    public void creeazaSoftware() {
        System.out.println("Software-ul a fost creat");
    }
}
