package ro.ase.cts.Farmacie;

public class Medicament {
    
    private int id;
    private boolean medicamentDorit;
    
    public Medicament(int id, boolean medicamentDorit) {
        this.id = id;
        this.medicamentDorit = medicamentDorit;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public boolean getMedicamentDorit() {
        return medicamentDorit;
    }
    
    public void setMedicamentDorit(boolean medicamentDorit) {
        this.medicamentDorit = medicamentDorit;
    }
    
    @Override
    public String toString() {
        return "Farmacie [id=" + id + ", medicamentDorit=" + medicamentDorit + "]";
    }
    
}