package ro.ase.cts.Biblioteca;

import java.util.HashMap;

public class BibliotecaFactory {

    private HashMap<Integer, Biblioteca> listaBiblioteci;

    public BibliotecaFactory() {
        listaBiblioteci = new HashMap<>();
    }

    public IBiblioteca getBiblioteca(int nrCarte) {

        if (listaBiblioteci.containsKey(nrCarte)) {
            return listaBiblioteci.get(nrCarte);
        } else {
            IBiblioteca biblioteca = new Biblioteca(nrCarte, 25, 7);
            listaBiblioteci.put(nrCarte, (Biblioteca) biblioteca);
            return biblioteca;
        }
    }
}
