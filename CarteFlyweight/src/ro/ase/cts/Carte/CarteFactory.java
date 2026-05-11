package ro.ase.cts.Carte;

import java.util.HashMap;

public class CarteFactory {

    private HashMap<Integer, Carte> listaCarti;

    public CarteFactory() {

        listaCarti = new HashMap<Integer, Carte>();

    }

    public ICarte getCarte(int codCarte) {

        if(listaCarti.containsKey(codCarte)) {

            return listaCarti.get(codCarte);

        } else {

            ICarte carte = new Carte(codCarte, 35);
            listaCarti.put(codCarte, (Carte) carte);
            return carte;

        }

    }

}