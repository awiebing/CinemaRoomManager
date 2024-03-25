import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number;

        while(true) {
            number = scanner.nextInt();
            if (number == 0) {
                break; }
            System.out.println(number % 2 == 0 ? "even" : "odd");

            }
        }


      }

