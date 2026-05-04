package ro.ase.cts.Fabrica;

public class Item implements Optiune {

    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        throw new Exception("Implementare invalida!");
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        throw new Exception("Implementare invalida!");
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        throw new Exception("Implementare invalida!");
    }

    @Override
    public void detalii() {
        System.out.println("Item: " + nume);
    }
    
}