// Create SpringSeason  class to check for spring season
public class SpringSeason {
    // Method to check if the date comes in Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Spring season is from March 20 to June 20
        // From March 20 to the end of March
        if (month == 3 && day >= 20) { 
            return true;
        // All of April and May
        } else if (month == 4 || month == 5) { 
            return true;
        // Until June 20
        } else if (month == 6 && day <= 20) { 
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // Ensure both arguments are there
        if (args.length != 2) {
            System.out.println("Please provide both month and day as arguments.");
            return;
        }
            // Parse command line arguments
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);
            // Check if the date comes in Spring season
            if (isSpringSeason(month, day)) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }
    }
}
