package ro.ase.cts.Autobuz;

public class Facade {

    public static boolean verificaButon(int nrUsi) {

        Autobuz autobuz = new Autobuz();
        if (autobuz.verificareButonActionareUsi(nrUsi)) {

            Sofer sofer = new Sofer();
            if (sofer.areButonActionareUsi(nrUsi) && sofer.areButonActionareUsiUrgenta(nrUsi)) {
                
                return true;
                
            } else {
                
                return false;
                
            }

        } else {
            
            return false;
        }
        
    }

    public static String verificaExistentaButoane(int nrUsi) { // corect: String

        Autobuz autobuz = new Autobuz();
        if (autobuz.verificareButonActionareUsi(nrUsi)) {

            Sofer sofer = new Sofer();
            if (sofer.areButonActionareUsi(nrUsi) && sofer.areButonActionareUsiUrgenta(nrUsi)) {
                
                return "Actionare butoane usi";
                
            } else {
                
                return "Butoane inactive";
                
            }

        } else {
            
            return "Usi nefunctionabile";
            
        }
        
    }
    
}