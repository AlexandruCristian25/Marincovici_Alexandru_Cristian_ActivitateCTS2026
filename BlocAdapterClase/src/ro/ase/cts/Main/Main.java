package ro.ase.cts.Main;

import ro.ase.cts.Bloc.*;

public class Main {

    public static void info(IBloc bloc) {
        System.out.println("Pentru locatari:");
        bloc.detalii();
    }

    public static void main(String[] args) {

       
        Bloc bloc = new Bloc(23, 80);
        System.out.println(bloc);

        System.out.println("\nCu Adapter de Clase:");
        IBloc blocAdaptat = new Adresa(23, 80);
        info(blocAdaptat);
        
    }
    
}