package ro.ase.cts.Main;

import ro.ase.cts.Biblioteca.Director;
import ro.ase.cts.Biblioteca.Student;

public class Main {
    public static void main(String[] args) {
        
        Student student = new Student("Biblioteca1");
        Director director = new Director();
        
        System.out.println(student.toString());
        director.adaugaMemento(student.salvareMemento());
        
        student.setNumeB("Biblioteca3");
        System.out.println(student.toString());
        
        director.adaugaMemento(student.salvareMemento());
        
        student.setNumeB("Biblioteca5");
        System.out.println(student.toString());
        
        try {
            
            student.undoToMemento(director.getMemento(0));
            System.out.println(student.toString());
            
        } catch(Exception e) {
            
            e.printStackTrace();
        }
        
    }
    
}