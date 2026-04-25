package ro.ase.cts.Bilet;

public class BiletElectronic implements IBilet {
    @Override
    public void rezervare(String persoana, int nrLoc) {
        System.out.println(persoana + " are bilet electronic cu numarul locului " + nrLoc);
    }
}
