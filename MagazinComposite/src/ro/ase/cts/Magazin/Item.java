package ro.ase.cts.Magazin;

public class Item implements IMagazin {
    
    private String nume;
    
    public Item(String nume) {
        
        this.nume = nume;
        
    }
    
    @Override
    public void adaugaNod(IMagazin magazin) {
        throw new UnsupportedOperationException("Nu este implementata");
    }
    
    @Override
    public void stergeNod(IMagazin magazin) {
        throw new UnsupportedOperationException("Nu este implementata");
    }
    
    @Override
    public IMagazin getNod(int index) {
        throw new UnsupportedOperationException("Nu este implementata");
    }
    
    @Override
    public void descriere() {
        
        System.out.println("Item: " + nume);
        
    }
    
}