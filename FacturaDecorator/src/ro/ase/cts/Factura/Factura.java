package ro.ase.cts.Factura;

public class Factura implements IFactura {
    
    private int cod;
    private double suma;
    
    public Factura(int cod, double suma) {
        super();
        this.cod = cod;
        this.suma = suma;
    }
    
    public int getCod() {
        return cod;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public double getSuma() {
        return suma;
    }
    
    public void setSuma(double suma) {
        this.suma = suma;
    }
    
    @Override
    public void afiseazaDetalii() {
        System.out.println("Factura cu codul " + cod + " cu suma de " + suma + " lei");
    }
    
}