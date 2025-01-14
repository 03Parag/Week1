// Create NullPointerExceptionProgram to generate a exception and refactoe the code to handle the  runtime exception
public class NullPointerExceptionProgram {
    // Method to generate NullPointerException
    public static void generateException(){
        // Initialize the text to null
        String text = null;
        // Call a string method to generate the exception
        System.out.println(text.length());
    }
    // Method to handle the NullPointerException
    public static void handleException() {
        // Initialize the text to null
        String text = null;
        try {
            // Try to call a string method
            System.out.println(text.length());
        } catch (NullPointerException e) {
            // Handle the exception
            System.out.println("Found a NullPointerException : " + e.getMessage());
        }
    }
    public static void main(String[]args){
        System.out.println("Demonstrate NullPointerException ");
        // Call the method for generating exception
        try {
            generateException();
        } catch(NullPointerException e) {
            System.out.println("Caught a NullPointerException : " + e.getMessage()); 
        }
        System.out.println("Refactoring the code to handle NullPointerException:");
        // Call the method for handling exception
        handleException();   
    }
}       