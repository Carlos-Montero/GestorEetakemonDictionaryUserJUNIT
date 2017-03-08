import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by Carlos on 08/03/2017.
 */
public class Test {

    @org.junit.Test
    public void createEetakemonTest() {
        Eetakemon e = new Eetakemon("carlos",0,15);
        assertEquals("carlos", e.getName());
        assertEquals(0, e.getId());
        assertEquals(15, e.getLevel());
    }


    @org.junit.Test
    public void createUserTest() {
        User u = new User("xavi","xavi@xavi.com","123");
        assertEquals("xavi", u.getUsername());
        assertEquals("xavi@xavi.com", u.getMail());
        assertEquals("123", u.getPasswordHash());
    }




    /*@org.junit.Test
    public void restaTest() {
        Calculadora c = new Calculadora(3, 2);
        assertEquals(1, c.resta());
    }

    @org.junit.Test
    public void multiplicacionTest() {
        Calculadora c = new Calculadora(2, 3);
        assertEquals(6, c.multiplicacion());
    }

    @org.junit.Test
    public void divisionTest() {
        Calculadora c = new Calculadora(6, 3);
        assertEquals(2, c.division());
    }

    @org.junit.Test//(expected = java.lang.ArithmeticException.class)
    public void divisionEntreCeroTest() throws Exception {
        Calculadora c = new Calculadora(6, 0);
        assertEquals(0, c.division());
    }*/
}