package ro.ase.cts.Calculator;

public class Element implements Optiune {
    
    private String nume;
    
    public Element(String nume) {
        this.nume = nume;
    }
    
    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        throw new Exception("Nu exista!");
    }
    
    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        throw new Exception("Nu exista!");
    } 
    
    @Override
    public Optiune getNod(int index) throws Exception {
        throw new Exception("Nu exista!");
    }
    
    @Override
    public void descriere() {
        System.out.println("Element: " + nume);
    }
}