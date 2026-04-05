package ro.ase.cts.Companie;

public class Item implements BazaDate {
    
    private String nume;
    
    public Item(String nume) {
        this.nume = nume;
    }
    
    @Override
    public void stergeAngajat(BazaDate bazaDate) {
        throw new UnsupportedOperationException("Nu este implementata");
    }
    
    @Override
    public void adaugaAngajat(BazaDate bazaDate) {
        throw new UnsupportedOperationException("Nu este implementata");
    }
    
    @Override
    public void detalii() {
        System.out.println("Item: " + nume);
    }
    
}