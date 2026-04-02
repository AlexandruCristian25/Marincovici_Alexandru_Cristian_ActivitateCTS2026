package ro.ase.cts.Laptop;

public class LaptopOffice implements ILaptop {
    
    @Override
    public void utilizeaza(String numeProgramator, int RAM) {
        System.out.println(numeProgramator + " utilizeaza un laptop de Office cu " + RAM + "GB RAM");
    }
    
}