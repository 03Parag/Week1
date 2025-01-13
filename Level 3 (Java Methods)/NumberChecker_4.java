// Create NumberChecker_4 class to check different methods
public class NumberChecker_4 {
    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        // Count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        // Store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }
    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube the factor
        }
        return product;
    }
    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Sum of proper divisors
        return sum == number; // Perfect number condition
    }
    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Sum of proper divisors
        return sum > number; // Abundant number condition
    }
    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Sum of proper divisors
        return sum < number; // Deficient number condition
    }
    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number; // Strong number condition
    }
    // Helper method to calculate factorial
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        int number = 145; // Example number to test
        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        // Find greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor of " + number + ": " + greatestFactor);
        // Find sum of factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors of " + number + ": " + sum);
        // Find product of factors
        int product = productOfFactors(factors);
        System.out.println("Product of factors of " + number + ": " + product);
        // Find product of cubes of factors
        double cubeProduct = productOfCubesOfFactors(factors);
        System.out.println("Product of cubes of factors of " + number + ": " + cubeProduct);
        // Check if number is perfect
        System.out.println(number + " is a perfect number: " + isPerfectNumber(number));
        // Check if number is abundant
        System.out.println(number + " is an abundant number: " + isAbundantNumber(number));
        // Check if number is deficient
        System.out.println(number + " is a deficient number: " + isDeficientNumber(number));
        // Check if number is strong
        System.out.println(number + " is a strong number: " + isStrongNumber(number));
    }
}
