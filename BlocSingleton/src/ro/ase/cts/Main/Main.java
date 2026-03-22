package ro.ase.cts.Main;

import ro.ase.cts.Bloc.Bloc;

public class Main {
    
    public static void main(String[] args) {
        
        Bloc b1 = Bloc.getInstance();
        Bloc b2 = Bloc.getInstance();
        
        b1.setNumeBloc("Nume bloc: M2/4");
        b1.setNrApartamente(78);
        
        System.out.println(b1.getNumeBloc());
        System.out.println(b1.getNrApartamente());
        
    }
    
}