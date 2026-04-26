package ro.ase.cts.Biblioteca;

public class Main {
    public static void main(String[] args) {

        PermisB permisBMatei = new PermisB("Matei", 20);
        PermisB permisBAlina = new PermisB("Alina", 22);
        PermisB permisBCatalina = new PermisB("Catalina", 21);

        BibliotecaFactory factory = new BibliotecaFactory();

        IBiblioteca biblioteca2 = factory.getBiblioteca(4826);
        biblioteca2.printare(permisBCatalina);
        factory.getBiblioteca(3652).printare(permisBAlina);
        factory.getBiblioteca(1038).printare(permisBMatei);
    }
}
