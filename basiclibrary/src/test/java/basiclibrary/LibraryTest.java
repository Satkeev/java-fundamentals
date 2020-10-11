/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class LibraryTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test public void testRoll() {
        int[] rolls = Library.roll(3);
        //should be length of 3
        //numbers should be between 1 and 6
        Random rnd = new Random();
        int index = rnd.nextInt(rolls.length);
        assertEquals("Length of array should equal # of dice rolls", 3, rolls.length);
        assertTrue("Value at any given index should be 1-6",rolls[index] < 7 && rolls[index] > 0);
    }

    @Test public void testContainsDuplicates() {
        int[] noDupes = {1, 2, 3, 4};
        assertFalse(Library.containsDuplicates(noDupes));

        int[] dupes = {1, 2, 3, 2};
        assertTrue(Library.containsDuplicates(dupes));
    }

    @Test public void testAverage() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals("Should return the average of all values in the array", 2.5, Library.average(numbers), 0.001);

        int[] moreNumbers = {4, 4, 4, 4};
        assertEquals("Should return the average of all values in the array", 4, Library.average(moreNumbers), 0.001);
    }

    @Test public void testLowestAverage() {
        int[][] basic = {
                {4, 5, 4, 5},
                {1, 2, 3, 4},
                {3, 3, 3, 3},
                {10, 11, 13, 400}
        };
        assertEquals("Should give back the array that has the lowest average", basic[1], Library.lowestAverage(basic));

        //set given as an example from the assignment. Averages are: 63, 63.571428571, 57, 57.428571429
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals("should return the third array in the set", weeklyMonthTemperatures[2], Library.lowestAverage(weeklyMonthTemperatures));
    }

    @Test public void testAnalyzeData() {
        Library.analyzeData();
        assertEquals("High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69\n", outContent.toString());
    }

    @Test public void testTally() {
        //example data from lab assignment, seemed like a good set to use for a test
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        assertEquals("Bush received the most votes!", Library.tally(votes));
    }
    //TODO: Utilize this test if time allows for creating a solution for ties
//    @Test public void testTallyTie() {
//        List<String> votes = new ArrayList<>();
//        votes.add("Bush");
//        votes.add("Hedge");
//        votes.add("Shrub");
//
//
//        assertEquals("Should do something in the instance of a tie"," received the most votes!", Library.tally(votes));
//    }
}

