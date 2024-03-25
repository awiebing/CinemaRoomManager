import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int sum = 0;
        int[] array = new int[arraySize];

        int length = array.length;

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int val : array) {
            sum += val;
        }
        System.out.println(sum);
    }
}