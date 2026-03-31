package ro.ase.cts.Restaurant;

import java.util.HashMap;

public class RestaurantFactory {
    
    private HashMap<String, Restaurant>();
    
}

public IRestaurant getRestaurant(String numeClient) {
    
    if(listaRestaurante.containsKey(numeClient)) {
        
        return listaRestaurante.get(numeClient);
        
    } else {
        
        IRestaurant = new Restaurant(numeClient, "Ionescu", "Popescu", "Gigel", "Alex");
        listaRestaurante.put(numeClient, (Restaurant) restaurant);
        return restaurant;
        
    }
    
}