package basiclibrary;
import java.util.Arrays;

public class Roll {
    public double[] diceRoll(int numberOfRolls) {
        double[] rollArray = new double[numberOfRolls];
        for (int i = 0; i < numberOfRolls; i++) {
            double aNumber = Math.random() * 6;
            aNumber = Math.ceil(aNumber);
            rollArray[i] = aNumber;
        }
        System.out.println(Arrays.toString(rollArray));
        return rollArray;
    }
}

