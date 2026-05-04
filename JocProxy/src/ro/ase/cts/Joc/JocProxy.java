package ro.ase.cts.Joc;

public class ProxyJucator implements Jucator {

    private JucatorReal jucator;
    private int varsta;

    public ProxyJucator(JucatorReal jucator, int varsta) {
        this.jucator = jucator;
        this.varsta = varsta;
    }

    @Override
    public void joaca() {
        if (varsta >= 14) {
            jucator.joaca();
        } else {
            System.out.println("Jucatorul este prea mic pentru a participa.");
        }
    }
}