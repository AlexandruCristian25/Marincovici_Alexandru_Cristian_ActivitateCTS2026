package ro.ase.cts.Main;

import ro.ase.cts.Film.Film;
import ro.ase.cts.Film.FilmFactory;
import ro.ase.cts.Film.TipFilm;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        
        FilmFactory filmFactoryfactory = new FilmFactory();
        
        Film f1 = FilmFactory.adaugaFilm(TipFilm.FilmActiune, 5, 25.99);
        Film f2 = FilmFactory.adaugaFilm(TipFilm.FilmAventura, 15, 45.99);
        Film f3 = FilmFactory.adaugaFilm(TipFilm.FilmComedie, 10, 30.99);
        
        f1.afiseazaInfo();
        f2.afiseazaInfo();
        f3.afiseazaInfo();
        
    }
}