import static org.junit.Assert.*;
import org.junit.Test;


public class FilkTest {
    @Test
    public void isSameNumber() {
        /* assertEquals for comparison of ints takes two arguments:
        assertEquals(expected, actual).

        If the two arguments are not equal, then the assertion will be false,
        and this test will fail.
        */

        assertTrue("false", Filk.isSameNumber(5, 6));
        assertTrue("true", Filk.isSameNumber(5, 5));

    }
}
