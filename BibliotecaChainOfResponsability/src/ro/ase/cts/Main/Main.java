package ro.ase.cts.Main;

import ro.ase.cts.Biblioteca.NotificareSMS;
import ro.ase.cts.Biblioteca.Student;

public class Main {
    public static void main(String[] args) {
        
        NotificareSMS notificareSMS = new NotificareSMS();
        notificareSMS.setNotificare(null);
        
        Student student = new Student("Irina", null, null);
        notificareSMS.notifica(student, "Notificare primita");
        
    }
    
}