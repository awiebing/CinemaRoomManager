import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int val = scanner.nextInt();
        boolean result = val < 10 && val > 0;
        System.out.println(result);
    }
}