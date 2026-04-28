package ro.ase.cts.Laptop;

public class Utilizator extends Laptop {

    public Utilizator(String marca) {
        super(marca);
    }

    @Override
    public void cumparaLaptop(String marca) {
        System.out.println("A fost achizitionat laptopul de la firma " + marca);
    }

    @Override
    public void schimbaLaptop(String marca) {
        System.out.println("A fost schimbat laptopul de la firma " + marca);
    }
    
}