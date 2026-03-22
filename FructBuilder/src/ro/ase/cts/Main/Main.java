package ro.ase.cts.Main;

import ro.ase.cts.Fruct.FructBuilder;


public class Main {
    
    public static void main(String[] args) {
        
        FructBuilder fruct = new FructBuilder.Builder().setCuloare("Rosu").build();
        
        System.out.println(fruct.toString());
        
    }
    
}