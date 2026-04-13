package ro.ase.cts.Agentie;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    
    private List<Boolean> listaPachete;
    
    public Operator() {
        
        listaPachete = new ArrayList<Boolean>();
        for(int i = 0; i < 4; i++) {
            listaPachete.add(true);
        }
        
        for(int i = 4; i < 14; i++) {
            listaPachete.add(false);
        }
        
    }
    
    public boolean pachetCuOferta(int cod) {
        
        if(cod >= 0 && cod < listaPachete.size()) {
            
            return listaPachete.get(cod);
            
        }
        
        return false;
        
    }
    
    public boolean pachetCuDiscount(int codPachet) {
        
        if(codPachet >= 0 && codPachet < listaPachete.size()) {
            
            return listaPachete.get(codPachet);
            
        }
        
        return false;
        
    }
    
}