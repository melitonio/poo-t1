package clasesobjetos;
public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", "Perez", "1990-01-01", 'H', 70.5);  
        Persona a = new Persona("Maria", "Lopez", "1995-01-01", 'M', 60.5);

        Complejo c1 = new Complejo(3, 4);
        Complejo c2 = new Complejo(1, 2);

        c1.imprimir();
        c2.imprimir();

        persona1.imprimir();
        a.imprimir();
    }
}