package ro.ase.cts.Tramvai;

public class Statie extends Tramvai {

    public Statie(String numeStatie) {
        super(numeStatie);
    }

    @Override
    public void nrLinie(String numeStatie) {
        System.out.println("Nr statiei " + numeStatie);
    }

    @Override
    public void cautareStatie(String numeStatie) {
        System.out.println("Se cauta statia " + numeStatie);
    }

    @Override
    public void platesteBilet(String numeStatie) {
        System.out.println("S-a platit biletul pentru " + numeStatie);
    }
    
}
