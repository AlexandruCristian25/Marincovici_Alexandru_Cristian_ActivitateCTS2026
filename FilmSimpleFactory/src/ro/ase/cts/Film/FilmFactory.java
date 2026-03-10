package ro.ase.cts.Film;

public class FilmFactory {
    
    private static FilmFactory instance = null;
    
    public static synchronized FilmFactory getInstance() {
        
        if(instance != null) {
            
            instance = new FilmFactory();
            
        }
        
        return instance;
        
    }
    
    private FilmFactory() {
    }
    
    public Film getFilm(TipFilm tipFilm, int nrActori) {
        
        Film film = null;
        
        return switch(tipFilm) {
            
            case FilmAventura -> new FilmAventura(nrActori);
            case FilmActiune -> new FilmAventura(nrActori);
            case FilmComedie -> new FilmComedie(nrActori);
            default->null;
            
        }
        
    }
    
}