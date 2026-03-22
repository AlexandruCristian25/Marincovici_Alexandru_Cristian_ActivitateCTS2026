package ro.ase.cts.Film;

public class FilmFactory {

    public static Film adaugaFilm(TipFilm tipFilm, int nrActori, double pretBilet) throws IllegalAccessException {

        return switch(tipFilm) {
            
            case FilmAventura -> new FilmAventura(nrActori, pretBilet);
            case FilmActiune -> new FilmAventura(nrActori, pretBilet);
            case FilmComedie -> new FilmComedie(nrActori, pretBilet);
            default -> throw new IllegalAccessException("Tip film inexistent: " + tipFilm);
            
        };
        
    }
    
}