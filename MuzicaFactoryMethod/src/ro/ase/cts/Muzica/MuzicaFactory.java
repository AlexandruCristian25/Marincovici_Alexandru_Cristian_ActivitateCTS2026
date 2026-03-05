package ro.ase.cts.Muzica;

public class MuzicaFactory {

    public static Muzica creareMuzica(TipMuzica tip, String titlu, String artist) {

        switch (tip) {
            case DEEPHOUSE:
                return new DeepHouse(titlu, artist);
            case HIPHOP:
                return new HipHop(titlu, artist);
            case ROCK:
                return new Rock(titlu, artist);
            default:
                throw new IllegalArgumentException("Tip muzica invalid");
            
        }
        
    }
    
}
