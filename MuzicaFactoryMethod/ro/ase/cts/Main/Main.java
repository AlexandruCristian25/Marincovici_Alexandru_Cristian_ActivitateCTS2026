package ro.ase.cts.Main;

import ro.ase.cts.Muzica.*;

public class Main {
    public static void main(String[] args) {

        Muzica m1 = MuzicaFactory.creareMuzica(TipMuzica.DEEPHOUSE, "Midnight Groove", "DJ Alex");
        Muzica m2 = MuzicaFactory.creareMuzica(TipMuzica.HIPHOP, "Street Flow", "MC Ion");
        Muzica m3 = MuzicaFactory.creareMuzica(TipMuzica.ROCK, "Thunder Sound", "The Rockers");

        m1.descriereGen();
        m2.descriereGen();
        m3.descriereGen();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        
    }
    
}
