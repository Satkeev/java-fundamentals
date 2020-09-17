import java.util.HashSet;

public class Maps {
    public String weatheReport(int [][] weatherData){
        HashSet<Integer> unigueTemps = new HashSet<>();
        for (int i = 0; i<weatherData.length; i++){
            for (int j = 0; j<weatherData[i].length; j++){
                unigueTemps.add(weatherData[i][j]);

            }
        }
        int lowTemp = 10000;
        int highTemp = -100000;
        for (Integer bananaTemp: unigueTemps) {
            if(bananaTemp < lowTemp) {
                lowTemp = bananaTemp;

            }
            if(bananaTemp > highTemp){
                highTemp = bananaTemp;
            }
            System.out.println(bananaTemp);
        }
        System.out.println(highTemp);
        System.out.println(lowTemp);
        String returnString = "High: " + highTemp + "\nLow: " + lowTemp;
        for (int k = lowTemp; k <highTemp; k++){
            if(!unigueTemps.contains(k)){
                returnString = returnString + "\nNever saw temperature: " + k;

            }
        }
    }
}