package ro.ase.cts.Main;

import ro.ase.cts.Restaurant.*;

public class Main {
    public static void main(String[] args) {

        Supa supaLegume = SupaFactory.creareSupa(TipSupa.LEGUME, 15.5f, 400);
        Supa supaCiuperci = SupaFactory.creareSupa(TipSupa.CIUPERCI, 18.0f, 450);
        Supa supaVita = SupaFactory.creareSupa(TipSupa.VITA, 22.5f, 500);

        System.out.println(supaLegume);
        System.out.println(supaCiuperci);
        System.out.println(supaVita);
    }
}
