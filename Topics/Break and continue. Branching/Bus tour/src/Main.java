import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int heigthOfBus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();


        int[] heightsOfBridges = new int[numberOfBridges];

        for (int i = 0; i < numberOfBridges; i++) {
            heightsOfBridges[i] = scanner.nextInt();
        }
        boolean crashed = false;

        for (int i = 0; i < heightsOfBridges.length; i++) {
            int bridgeNumber = i + 1;
            if (heightsOfBridges[i] <= heigthOfBus) {
                System.out.println("Will crash on bridge " + bridgeNumber);
                crashed = true;
                break;

            }
        }
        if (!crashed) {
            System.out.println("Will not crash");
        }




    }
}