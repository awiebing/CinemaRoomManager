import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int len = array.length;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int greaterThanN = scanner.nextInt();
        int sum = 0;
        for (int val : array) {
            if (val > greaterThanN) {
                sum += val;
            }
        }

        System.out.println(sum);

    }
}