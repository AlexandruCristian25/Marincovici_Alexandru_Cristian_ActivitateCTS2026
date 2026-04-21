package ro.ase.cts.Barca;

public class Barca implements IBarca {
    
    private int codBarca;
    private int putereMotor;
    private int capacitate;
    
    public Barca(int codBarca, int putereMotor, int capacitate) {
        super();
        this.codBarca = codBarca;
        this.putereMotor = putereMotor;
        this.capacitate = capacitate;
    }
    
    @Override
    public void tipareste(Rezervare rezervare) {
        System.out.println(this.toString() + " " + rezervare.toString());
    }
    
    @Override
    public String toString() {
        return "Barca [codBarca=" + codBarca + ", putereMotor=" + putereMotor + ", capacitate=" + capacitate + "]";
    }
    
}