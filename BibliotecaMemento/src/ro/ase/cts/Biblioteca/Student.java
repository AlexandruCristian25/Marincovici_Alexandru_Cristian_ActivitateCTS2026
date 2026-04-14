package ro.ase.cts.Biblioteca;

public class Student {
    
    private String numeB;
    private String numeStudent;
    
    public Student(String numeB) {
        
        super();
        this.numeB = numeB;
        
    }
    
    public String getNumeB() {
        
        return numeB;
        
    }
    
    public void setNumeB(String numeB) {
        
        this.numeB = numeB;
        
    }
    
    @Override
    public String toString() {
        
        return "Student [numeB=" + numeB + "]";
        
    }
    
    public MementoBiblioteca salvareMemento() {
        
        return new MementoBiblioteca(numeB);
        
    }
    
    public void undoToMemento(MementoBiblioteca memento) {
        
        this.numeB = memento.getNumeB();
        
    }
    
}