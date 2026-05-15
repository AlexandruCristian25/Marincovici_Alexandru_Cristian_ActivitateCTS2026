package com.example;

import java.util.ArrayList;
import java.util.List;

public class Cont {

    private final List<Boolean> listaClienti;

    public Cont() {

        listaClienti = new ArrayList<>();
        for (int i = 0; i < 7; i++) {

            listaClienti.add(true);

        }

        for (int i = 7; i < 10; i++) {

            listaClienti.add(false);

        }

    }

    private int getIndexClient(String numeClient) {

        return Integer.parseInt(numeClient.replace("Client", "")) - 1;

    }

    public boolean areCazier(String numeClient) {

        int index = getIndexClient(numeClient);
        return listaClienti.get(index);

    }

    public boolean areAltCont(String numeClient) {

        int index = getIndexClient(numeClient);
        return !listaClienti.get(index);

    }

}
