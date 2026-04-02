package ro.ase.cts.Hotel;

public class Item implements Rezervare {
    
    private String denumire;
    
    public Item(String denumire) {
        this.denumire = denumire;
    }
    
    @Override
    public void stergeRezervare(Rezervare rezervare) throws Exception {
        throw new UnsupportedOperationException("Operatie nepermisa pentru Item");
    }
    
    @Override
    public void adaugaRezervare(Rezervare rezervare) throws Exception {
        throw new UnsupportedOperationException("Operatie nepermisa pentru Item");
    }
    
    @Override
    public Rezervare getRezervare(int index) throws Exception {
        throw new UnsupportedOperationException("Operatie nepermisa pentru Item");
    }
    
    @Override
    public void info() {
        System.out.println("Item: " + denumire);
    }
    
}