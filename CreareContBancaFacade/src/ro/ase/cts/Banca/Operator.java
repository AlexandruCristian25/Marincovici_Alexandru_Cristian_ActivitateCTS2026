package com.example;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    private final List<String> listaOperatori;

    public Operator() {

        listaOperatori = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            listaOperatori.add("Client" + (i + 1));

        }

    }

    public boolean verificareOperator(String numeClient) {

        return listaOperatori.contains(numeClient);

    }

}
