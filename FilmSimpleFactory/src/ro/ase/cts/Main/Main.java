package ro.ase.cts.Main;

import ro.ase.cts.Film.Film;

public class Main {
    public static void main(String[] args) {
        
        FilmFactory factory = FilmFactory.getInstance();
        
        Film filmActiune = factory.getFilm(TipFilm.FilmActiune, 5);
        Film filmAventura = factory.getFilm(TipFilm.FilmAventura, 15);
        Film filmComedie = factory.getFilm(TipFilm.FilmComedie, 10);
        
        System.out.println(filmActiune.toString());
        System.out.println(filmAventura.toString());
        System.out.println(filmComedie.toString());
        
        FilmFactory factory2 = FilmFactory.getInstance();
        
    }
}