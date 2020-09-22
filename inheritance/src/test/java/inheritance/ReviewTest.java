package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {


    @Test
    public void testReviewToString() {
        Review test = new Review("Perfect", "Kamit", 4);

        assertEquals("Should return: Perfect, Kamit, 4",
                "body: Perfect , author: Kamit , stars: 4 ",
                test.toString());
    }
}
