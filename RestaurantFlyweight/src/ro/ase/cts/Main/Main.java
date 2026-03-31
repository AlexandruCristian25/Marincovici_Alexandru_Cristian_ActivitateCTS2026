package ro.ase.cts.Main;

import ro.ase.cts.IRestaurant;
import ro.ase.cts.Rezervare;
import ro.ase.cts.RestaurantFactory;

public class Main {
    public static void main(String[] args) {
        
        Rezervare rezervareIonescu = new Rezervare("Ionescu", "13:00");
        Rezervare rezervarePopescu = new Rezervare("Popescu", "09:00");
        Rezervare rezervareAlex = new Rezervare("Alex", "21:00");
        
        RestaurantFactory factory = new RestaurantFavtory();
        
        IRestaurant restaurant2 = factory.getRestaurant("Gigel");
        restaurant2.tipareste(rezervareIonescu);
        factory.getRestaurant("Popescu").tipareste(rezervarePopescu);
        factory.getRestaurant("Alex").tipareste(rezervareAlex);
        
    }
}