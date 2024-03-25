import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        StringBuilder string = new StringBuilder();
        string = new StringBuilder(scanner.nextLine());


        // TODO: Write a function to reverse the input string and print it
        System.out.println(string.reverse());
        // Close the scanner object to prevent memory leaks
        scanner.close();
    }
}