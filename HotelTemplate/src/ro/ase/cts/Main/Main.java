package ro.ase.cts.Main;

import ro.ase.cts.Hotel.Hotel;
import ro.ase.cts.Hotel.CazareHotel;
import ro.ase.cts.Hotel.RezervarePachet;
import ro.ase.cts.Hotel.AchitarePachet;

public class Main {
    public static void main(String[] args) {
        
        Hotel hotel1 = new CazareHotel(45);
        hotel1.vindePachet();
        
        Hotel hotel2 = new RezervarePachet(170);
        hotel2.vindePachet();
        
        Hotel hotel3 = new AchitarePachet(23);
        hotel3.vindePachet();
        
    }
    
}