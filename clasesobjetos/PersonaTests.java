package clasesobjetos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonaTests {
    @Test
    public void testPersona() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);

        assertEquals("Juan", p.getNombre());
        assertEquals("Perez", p.getApellidos());
        assertEquals("01/01/2000", p.getFechaNacimiento());
        assertEquals('H', p.getSexo());
        assertEquals(70.0, p.getPeso(), 0.0);
    }

    @Test
    public void testEdad() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);

        assertEquals(21, p.edad(2021));
    }

    @Test
    public void testSetNombre() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);

        p.setNombre("Pedro");

        assertEquals("Pedro", p.getNombre());
    }

    @Test
    public void testSetApellidos() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);

        p.setApellidos("Gomez");

        assertEquals("Gomez", p.getApellidos());
    }

    @Test
    public void testSetFechaNacimiento() {
        Persona p = new Persona("Juan", "Perez", "01/01/2000", 'H', 70.0);

        p.setFechaNacimiento("02/02/2000");

        assertEquals("02/02/2000", p.getFechaNacimiento());
    }
}
