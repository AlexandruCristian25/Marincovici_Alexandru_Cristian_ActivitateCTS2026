package ro.ase.cts.FastFood;

public class Facade {

    public static boolean verificareMasa(int nrMasa) {

        Masa masa = new Masa();

        if (masa.verificaMasaLibera(nrMasa)) {

            Client client = new Client();

            return client.esteMasaCurata(nrMasa)
                    && client.esteMasaLibera(nrMasa);

        } else {
            return false;
        }
    }

    public static String verificareDisponibilitateMasa(int nrMasa) {

        Masa masa = new Masa();

        if (masa.verificaMasaLibera(nrMasa)) {

            Client client = new Client();

            if (client.esteMasaCurata(nrMasa)
                    && client.esteMasaLibera(nrMasa)) {

                return "Exista masa libera";

            } else {

                return "Mesele sunt ocupate";
            }

        } else {

            return "Nu exista aceasta masa";
        }
    }
}
