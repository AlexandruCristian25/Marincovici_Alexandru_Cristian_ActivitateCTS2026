public class Main {
    public static void main(String[] args) {

        Sectie spital = new Sectie("Spital Judetean");

        Sectie cardiologie = new Sectie("Cardiologie");
        Sectie pediatrie = new Sectie("Pediatrie");

        Doctor doctor1 = new Doctor("Popescu");
        Doctor doctor2 = new Doctor("Ionescu");
        Doctor doctor3 = new Doctor("Georgescu");

        cardiologie.adaugaNod(doctor1);
        cardiologie.adaugaNod(doctor2);

        pediatrie.adaugaNod(doctor3);

        spital.adaugaNod(cardiologie);
        spital.adaugaNod(pediatrie);

        spital.afiseaza("");
        
    }
    
}