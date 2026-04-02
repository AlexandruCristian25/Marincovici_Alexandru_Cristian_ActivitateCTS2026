package ro.ase.cts.Laptop;

public class LaptopHome implements ILaptop {
    
    @Override
    public void utilizeaza(String numeProgramator, int RAM) {
        System.out.println(numeProgramator + " utilizeaza un laptop de Home cu " + RAM + "GB RAM");
    }
    
}