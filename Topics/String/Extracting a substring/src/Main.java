import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int begin = scanner.nextInt();
        int eind = scanner.nextInt();

        System.out.println(input.substring(begin, eind + 1));


    }
}