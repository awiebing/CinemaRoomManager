import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String string1 = scanner.nextLine();
        string1 = string1.replace("a", "b");
        System.out.println(string1);
    }
}