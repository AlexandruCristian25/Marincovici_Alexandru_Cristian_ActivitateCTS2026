package ro.ase.cts.Animal;

public class Item implements Specie {

    private final String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Specie specie) throws Exception {
        throw new Exception("Nu exista implementare");
    }

    @Override
    public void stergeNod(Specie specie) throws Exception {
        throw new Exception("Nu exista implementare");
    }

    @Override
    public Specie getNod(Specie specie) throws Exception {
        throw new Exception("Nu exista implementare");
    }

    @Override
    public void detalii() {
        System.out.println("Item " + nume);
    }
}
