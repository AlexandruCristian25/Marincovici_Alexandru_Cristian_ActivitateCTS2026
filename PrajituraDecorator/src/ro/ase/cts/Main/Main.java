package ro.ase.cts.Prajitura;

public class Main {
    public static void main(String[] args) {
        IPrajitura prajitura = new Prajitura("Amandina", 25.5);
        IPrajitura decorata = new PrajituraDecorata(prajitura);

        decorata.afiseazaInfo();
    }
}
