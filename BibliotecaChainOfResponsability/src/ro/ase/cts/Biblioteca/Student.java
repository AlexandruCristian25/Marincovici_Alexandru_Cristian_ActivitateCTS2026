package ro.ase.cts.Biblioteca;

public class Student {
    
    private String nume;
    private String nrTelefon;
    private Integer codStudent;
    
    public Student(String nume, String nrTelefon, Integer codStudent) {
        super();
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.codStudent = codStudent;
    }
    
    public Student(String nume) {
        super();
        this.nume = nume;
        this.nrTelefon = null;
        this.codStudent = null;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public String getNrTelefon() {
        return nrTelefon;
    }
    
    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }
    
    public Integer getCodStudent() {
        return codStudent;
    }
    
    public void setCodStudent(Integer codStudent) {
        this.codStudent = codStudent;
    }
    
}