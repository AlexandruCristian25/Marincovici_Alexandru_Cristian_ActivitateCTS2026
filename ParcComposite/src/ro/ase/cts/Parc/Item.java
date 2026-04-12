package ro.ase.cts.Parc;

public class Item implements IParc {
    
    private String nume;
    
    public Item(String nume) {
        this.nume = nume;
    }
    
    @Override
    public void stergeNod(IParc parc) throws Exception {
        throw new Exception("Nu este implementata");
    }
    
    @Override
    public void adaugaNod(IParc parc) throws Exception {
        throw new Exception("Nu este implementata");
    }
    
    @Override
    public IParc getNod(int index) throws Exception {
        throw new Exception("Nu este implementata");
    }
    
    @Override
    public void info() {
        System.out.println("Item " + nume);
    }
    
}