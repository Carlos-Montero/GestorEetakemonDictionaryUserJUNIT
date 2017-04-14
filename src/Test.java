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

    @org.junit.Test
    public void passwordHashTest() {
        String p="123";
        User.UserController c = new User.UserController();
        String res = c.hashCompute(p);
        assertEquals("a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3".toUpperCase(), res);

    }




}