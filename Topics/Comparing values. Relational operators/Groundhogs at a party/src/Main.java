import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peanuts = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean peanutsWeekend = peanuts >= 15 && peanuts <= 25;
        boolean peanutsWeek = peanuts >= 10 && peanuts <=20;

        boolean succes = weekend && peanutsWeekend || !weekend && peanutsWeek;

        System.out.println(succes);

    }
}