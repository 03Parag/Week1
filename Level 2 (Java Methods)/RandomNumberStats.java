import java.util.Random;
// Create RandomNumberStats class to finds their average value, and their minimum and maximum value
public class RandomNumberStats {
    // Method to create an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random rand = new Random();
        // Generate 4-digit random numbers (between 1000 and 9999)
        for (int i = 0; i < size; i++) {
            // Ensures numbers are between 1000 and 9999
            randomNumbers[i] = 1000 + rand.nextInt(9000); 
        }
        return randomNumbers;
    }
    // Method to find average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        // Calculate the sum, min, and max values
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        // Calculate average
        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }
    public static void main(String[] args) {
        // Create 5 random 4-digit numbers
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        // Find the average, min, and max values
        double[] stats = findAverageMinMax(randomNumbers);
        // Display the random numbers
        System.out.print("Generated 4-digit random numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Display the results
        System.out.println("Average value: " + stats[0]);
        System.out.println("Minimum value: " + stats[1]);
        System.out.println("Maximum value: " + stats[2]);
    }
}
