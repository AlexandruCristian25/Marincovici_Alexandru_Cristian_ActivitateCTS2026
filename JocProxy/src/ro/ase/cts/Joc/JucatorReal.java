package ro.ase.cts.Joc;

public class JucatorReal implements Jucator {

    private String nume;

    public JucatorReal(String nume) {
        this.nume = nume;
    }

    @Override
    public void joaca() {
        System.out.println(nume + " joaca.");
    }
}