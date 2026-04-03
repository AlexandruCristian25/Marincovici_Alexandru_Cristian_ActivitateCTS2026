package ro.ase.cts.Nava;

public class Nava implements INava {
    
    private String tipCamera;
    private String nume;
    private String data;
    
    public Nava(String tipCamera, String nume, String data) {
        
        super();
        this.tipCamera = tipCamera;
        this.nume = nume;
        this.data = data;
        
    }
    
    @Override
    public void detalii(Rezervare rezervare) {
        
        System.out.println(this.toString() + " " + rezervare.toString());
        
    }
    
    @Override
    public String toString() {
        
        return "Nava [tipCamera=" + tipCamera + ", nume=" + nume + ", data=" + data + "]";
        
    }
    
}