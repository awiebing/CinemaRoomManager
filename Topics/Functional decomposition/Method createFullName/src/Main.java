// Don't delete scanner import
import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println(createFullName(firstName, lastName));

    // use this program as a source of inspiration for your method


    }


    //implement your method here
    public static String createFullName (String firstName, String lastName) {

        return firstName + " " + lastName;
    }
}