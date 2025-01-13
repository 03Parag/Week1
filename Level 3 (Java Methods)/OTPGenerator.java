import java.util.HashSet;
// Create OTPGenerator class to create ten 6 digit OTP number and all of them unique
public class OTPGenerator {
    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Math.random() generates a random number between 0.0 and 1.0, multiply by 1,000,000 to get a 6-digit number
        // Ensures OTP is a 6-digit number
        return (int) (Math.random() * 900000) + 100000; 
    }
    // Method to ensure that OTPs generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                // Duplicate found, so return false
                return false; 
            }
        }
        return true; // All OTPs are unique
    }
    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTPs
        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }
        // Display the OTPs generated
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
        // Check if the OTPs are unique
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique!");
        } else {
            System.out.println("Some OTPs are duplicates.");
        }
    }
}
