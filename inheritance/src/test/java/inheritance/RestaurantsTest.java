package inheritance;


import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantsTest {


    @Test
    public void testRestaurantToString() {
        Restaurant restaurantTest = new Restaurant("Maggiano",  4, "30$");


        assertEquals("Should return: Maggiano, 0 average stars, 1 price category",
                "name: Maggiano ,stars: 4 ,price: 30$" ,
                restaurantTest.toString()
        );
    }
}
