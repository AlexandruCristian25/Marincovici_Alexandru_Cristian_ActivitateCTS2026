package ro.ase.cts.Autobuz;

public class Sofer {

    private String nume;
    private String program;

    public Sofer(String nume, String program) {
        this.nume = nume;
        this.program = program;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Sofer [nume=" + nume + ", program=" + program + "]";
    }
}
