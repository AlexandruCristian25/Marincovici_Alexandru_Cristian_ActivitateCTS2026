package ro.ase.cts.Bilet;

public class BiletFizic implements IBilet {
    @Override
    public void rezervare(String persoana, int nrLoc) {
        System.out.println(persoana + " are bilet fizic cu numarul locului " + nrLoc);
    }
}
