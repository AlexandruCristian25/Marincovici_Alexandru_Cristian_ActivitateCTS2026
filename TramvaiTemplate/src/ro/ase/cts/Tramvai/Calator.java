package ro.ase.cts.Tramvai;

public class Calator extends Tramvai {

    public Calator(String numeStatie) {
        super(numeStatie);
    }

    @Override
    public void nrLinie(String numeStatie) {
        System.out.println("Nr statiei " + numeStatie);
    }

    @Override
    public void cautareStatie(String numeStatie) {
        System.out.println("Se cauta " + numeStatie);
    }

    @Override
    public void platesteBilet(String numeStatie) {
        System.out.println("S-a platit biletul pentru " + numeStatie);
    }
    
}
