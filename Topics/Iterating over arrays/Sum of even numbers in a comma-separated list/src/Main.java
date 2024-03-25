import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a string that contains numbers separated by commas
        Scanner scanner = new Scanner(System.in);


        String numString = scanner.next(); // Put your numbers here


        // Split the string into an array of string numbers
        String[] stringArr = numString.split(",");

        // Convert the array of string numbers into array of integers
        int[] numArr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            numArr[i] = Integer.parseInt(stringArr[i]);
        }

        // Create a variable to store the sum of all even numbers
        int evenSum = 0;

        // Insert code here to iterate over the integer array and calculate the sum of all even numbers

        for (int val : numArr ) {
            if (val % 2 == 0) {
                evenSum += val;
            }
        }

        // Print the sum of all even numbers
        System.out.println(evenSum);
    }
}