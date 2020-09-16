package basiclibrary;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("this method return 'true'", classUnderTest.someLibraryMethod());

    }

    @Test
    public void testLengthMethod() {
        assertEquals(
                "The array should be long",
                5,
                Library.roll(5).length

        );
    }
}
