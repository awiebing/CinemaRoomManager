import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int len = array.length;
        boolean numberFound = false;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();



        for (int val : array) {
            if (val == number) {
                numberFound = true;
            }
        }
        System.out.println(numberFound);
    }
}