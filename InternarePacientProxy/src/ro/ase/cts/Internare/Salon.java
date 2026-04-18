package ro.ase.cts.Internare;

public class Salon implements Internare {
    
    private Pacient pacient;
    
    public Pacient getPacient() {
        return pacient;
    }
    
    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }
    
    public Salon(Pacient pacient) {
        this.pacient = pacient;
    }
    
    @Override
    public void descriere() {
        System.out.println("Detalii internare pacient");
    }
    
    @Override
    public void rezervare() {
        System.out.println(pacient.getNume() + " a facut o rezervare pentru a fi internat");
    }
    
}