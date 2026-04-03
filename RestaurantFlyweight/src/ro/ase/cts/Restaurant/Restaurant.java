package ro.ase.cts.Restaurant;

public class Restaurant implements IRestaurant {

    private String nume;
    private int nrOspatari;
    private String locatie;

    public Restaurant(String nume, int nrOspatari, String locatie) {

        this.nume = nume;
        this.nrOspatari = nrOspatari;
        this.locatie = locatie;

    }

    @Override
    public void tipareste(Rezervare rezervare) {

        System.out.println(this.toString() + " " + rezervare.toString());

    }

    @Override
    public String toString() {

        return "Restaurant [ nume = " + nume + ", nrOspatari = " + nrOspatari + " , locatie = " + locatie + "]";

    }

}