package ro.ase.cts.Biblioteca;

public class NotificareSMS extends Notificare {
    
    @Override
    public void notifica(Student student, String mesaj) {
        
        if(student.getNrTelefon() != null) {
            
            System.out.println(student.getNume() + " a primit un SMS de la biblioteca ce contine mesajul " + mesaj);
            
        } else {
            
            if(super.getNotificare() != null) {
                
                super.getNotificare().notifica(student, mesaj);
                
            }
            
        }
        
    }
    
}