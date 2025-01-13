// create NumberChecker_3 class to check different methods
public class NumberChecker_3 {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 and below are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true;
    }
    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }
    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }
    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String squareStr = Integer.toString(square);
        String numberStr = Integer.toString(number);
        return squareStr.endsWith(numberStr);
    }
    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
    public static void main(String[] args) {
        // Example number to test
        int number = 25;
        // Check if the number is a prime number
        System.out.println("Is " + number + " a Prime Number? " + isPrime(number));
        // Check if the number is a Neon Number
        System.out.println("Is " + number + " a Neon Number? " + isNeon(number));
        // Check if the number is a Spy Number
        System.out.println("Is " + number + " a Spy Number? " + isSpy(number));
        // Check if the number is an Automorphic Number
        System.out.println("Is " + number + " an Automorphic Number? " + isAutomorphic(number));
        // Check if the number is a Buzz Number
        System.out.println("Is " + number + " a Buzz Number? " + isBuzz(number));
    }
}
