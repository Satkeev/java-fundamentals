import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MapsTest {
    @Test  public void testTemperatures() {
        Maps maps = new Maps();
        int[][] weeklyMonthTemperatures = {
                {66 , 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65,51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 67, 57}
        };
        assertEquals(expected "High: 72", maps.missingTemps(weeklyMonthTemperatures));

    }
    @Test public void testVotes(){
        Maps maps = new Maps();

    }
}