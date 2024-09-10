package Weather;
import java.util.Random;

public class weather_exercise {
    public static void main(String[] args) {

        // Create an array to store all the temperature values
        double[] weatherData = new double[366];

        Random rand = new Random();

        // Using random to populate the array with values
        for(int i = 0; i < weatherData.length; i++){
            weatherData[i] = 30 + (120 - 30) * rand.nextDouble();
        }

        //Display all the elements in the list
        /*
        for (int i = 0; i < weatherData.length; i++) {
            System.out.printf("Day %d: %.2f°F\n", i + 1, weatherData[i]);
        }*/

        // Call the cleanData method and store its value in te cleanedArray
        double[] cleanedArray = cleanData(weatherData);
        // Call the longestHeatWave and store its value in te heatWaveDays variable
        int heatWaveDays = longestHeatWave(cleanedArray);

        System.out.println("Longest heat wave: " + heatWaveDays + " days");

    }

    public static double[] cleanData(double[] array){

        // Get the size for the new array
        int count = 0;
        for(double temp : array){
            if(temp >= 85 || temp < 120){
                count++;
            }
        }

        // Initialize a new array with the count as its length
        double[] cleanWeatherData = new double[count];
        int index = 0;

        // Create a new array to store only elements >= 85°F
        for(double temp : array){
            if(temp >= 85 || temp < 120){
                cleanWeatherData[index++] = temp;

            }
        }
        return cleanWeatherData;
    }

    public static int longestHeatWave(double[] array){

        int longestStreak = 0;
        int currentStreak = 0;

        /* If the element of the i index is higher than 100, then it increments the currentStreak
            If the element is less than 100 it resets the current streak.
            It updates the longestStreak every time the currentStreak is higher than longestStreak
        */
        for (int i = 0; i < array.length && i < 100; i++) {
            if (array[i] > 100) {
                currentStreak++;
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }
        return longestStreak;

    }

}
