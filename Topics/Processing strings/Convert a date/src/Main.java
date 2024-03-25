
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] dates = input.split("-");

        String output = dates[1] + "/" + dates[2] + "/" + dates[0];

        System.out.println(output);

    }
}