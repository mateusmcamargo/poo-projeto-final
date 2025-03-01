import java.util.Scanner;

// Class for validating integer and float inputs from strings
public class Validate {

    // Validates if the given string can be converted to an integer
    public static int validateInt(String string) throws ScannerFormatException {

        // Instantiates new Scanner
        Scanner scanner = new Scanner(string);

        if (scanner.hasNextInt()) {
            // Reads integer from the string
            return scanner.nextInt();
        } else {
            throw new ScannerFormatException(); // Throws exception if input is invalid
        }
    }

    // Validates if the given string can be converted to a float
    public static float validateFloat(String string) throws ScannerFormatException {

        // Instantiates new Scanner
        Scanner scanner = new Scanner(string);

        if (scanner.hasNextFloat()) {
            // Reads float from the string
            return scanner.nextFloat();
        } else {
            throw new ScannerFormatException(); // Throws exception if input is invalid
        }
    }
}
