/**
 * Created by nolan on 1/19/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class UserInterfaceSpec {


    @Test
            public void testSortBoo() {
        UserInterface ui = new UserInterface();

        assertFalse("sort boolean should equal false.", ui.getSort());
}
    @Test
    public void testrunMethod() {
        UserInterface ui = new UserInterface();

        ui.run(9, "y", new String[] {"a", "b", "q"});


        assertTrue("sort bool is switchable to true", ui.getSort());
    }
}
