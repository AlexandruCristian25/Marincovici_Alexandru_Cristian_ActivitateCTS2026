package ro.ase.cts.Bloc;

import java.util.ArrayList;
import java.util.List;

public class Proprietar {

    private List<Integer> apartamente;

    public Proprietar() {
        
        apartamente = new ArrayList<>();

        for (int i = 1; i <= 80; i++) {
            
            apartamente.add(i);
            
        }
        
    }

    public boolean detineApartament(int nr) {
        return apartamente.contains(nr);
    }
    
}