package ro.ase.cts.Restaurant;

import java.util.HashMap;

public class RestaurantFactory {

    private HashMap<String, IRestaurant> listaRestaurante = new HashMap<>();

    public IRestaurant getRestaurant(String numeClient) {

        if (listaRestaurante.containsKey(numeClient)) {

            return listaRestaurante.get(numeClient);

        } else {

            IRestaurant restaurant = new Restaurant(numeClient, 10, "Bucuresti");
            listaRestaurante.put(numeClient, restaurant);
            return restaurant;

        }

    }
    
}