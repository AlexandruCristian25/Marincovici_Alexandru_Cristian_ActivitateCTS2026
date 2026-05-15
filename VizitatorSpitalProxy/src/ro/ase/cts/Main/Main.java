package ro.ase.cts.Vizitator;

public class Main {

    public static void main(String[] args) {

        SalaAsteptare sala = new SalaAsteptare("Ion Popescu", 4);

        Vizitator vizitator = new Vizitator(sala);

        SalonProxy proxy = new SalonProxy(vizitator);

        proxy.echipareVizitator();
    }
}
