package ro.ase.cts.Produs;

public class Item implements Optiune {

    private String numeI;

    public Item(String numeI) {
        this.numeI = numeI;
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        throw new UnsupportedOperationException("Nu este implementata");
    }

    @Override
    public void stergeNod(Optiune optiune) {
        throw new UnsupportedOperationException("Nu este implementata");
    }

    @Override
    public Optiune getNod(int index) {
        throw new UnsupportedOperationException("Nu este implementata");
    }

    @Override
    public void info() {
        System.out.println("Item: " + numeI);
    }
    
}