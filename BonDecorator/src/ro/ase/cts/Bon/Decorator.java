package ro.ase.cts.Bon;

public abstract class Decorator implements IBon {
    
    protected Bon bon;
    
    public Decorator(Bon bon) {
        this.bon = bon;
    }
    
    @Override
    public void printeazaBon() {
        bon.printeazaBon();
        System.out.println("Paste fericit!");
    }
    
    public abstract void discount(int procent);
    
}