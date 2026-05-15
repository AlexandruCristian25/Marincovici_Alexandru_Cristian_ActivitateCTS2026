package com.example;

public class Facade {

    public static boolean verificareClient(String numeClient) {

        Operator operator = new Operator();

        if (operator.verificareOperator(numeClient)) {

            Cont cont = new Cont();
            return cont.areCazier(numeClient) && !cont.areAltCont(numeClient);

        }

        return false;

    }

    public static String verificareDisponibilitateClient(String numeClient) {

        Operator operator = new Operator();

        if (operator.verificareOperator(numeClient)) {

            Cont cont = new Cont();

            if (cont.areCazier(numeClient) && !cont.areAltCont(numeClient)) {

                return "Clientul a fost verificat si nu are cazier sau alt cont bancar";

            } else {

                return "Clientul a fost verificat, dar exista probleme cu istoricul sau conturile";

            }

        }

        return "Clientul nu a fost gasit";

    }

}
