package ro.ase.cts.Main;

import ro.ase.cts.Cafenea.Masa;

public class Main {
    public static void main(String[] args) {

        Masa masa = new Masa(9);
        masa.rezervaMasa();
        masa.ocupaMasa();
        masa.ocupaMasa();
        masa.rezervaMasa();

    }
    
}