package ro.ase.cts.Banca;

public class Client {
    
    private String nume;
    private MetodaPlata metodaPlata;
    
    public void plateste(double sumaPlata) {
        metodaPlata.plateste(this.nume, sumaPlata);
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public MetodaPlata getMetodaPlata() {
        return metodaPlata;
    }
    
    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }
    
    public Client(String nume, MetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }
    
    public Client(String nume) {
        this.nume = nume;
        this.metodaPlata = new Cash(); // default
    }
    
}