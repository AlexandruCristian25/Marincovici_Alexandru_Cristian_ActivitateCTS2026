package ro.ase.cts.Agentie;

import java.util.ArrayList;
import java.util.List;

public class Pachet {
    
    private List<Integer> listaPachete;
    
    public Pachet() {
        
        listaPachete = new ArrayList<Integer>();
        for(int i = 0; i < 8; i++) {
            
            listaPachete.add(i + 1);
            
        }
        
    }
    
    public boolean verificarePachet(int codPachet) {
        
        return listaPachete.contains(codPachet);
        
    }
    
}