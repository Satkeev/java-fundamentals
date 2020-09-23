package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {


    @Test
    public void testShopToString() {
        Shop shopTest = new Shop("QFC",  "Perfectshop", 4);

        assertEquals("Should be: QFC , Perfect shop , 4",
                "QFC, Best shop, 4",
                shopTest.toString()
        );
    }
}