import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ticketNumbers = scanner.nextLine();

        char char1 = ticketNumbers.charAt(0);
        char char2 = ticketNumbers.charAt(1);
        char char3 = ticketNumbers.charAt(2);
        char char4 = ticketNumbers.charAt(3);
        char char5 = ticketNumbers.charAt(4);
        char char6 = ticketNumbers.charAt(5);

        int charOne = Character.getNumericValue(char1);
        int charTwo = Character.getNumericValue(char2);
        int charThree = Character.getNumericValue(char3);
        int charFour = Character.getNumericValue(char4);
        int charFive = Character.getNumericValue(char5);
        int charSix = Character.getNumericValue(char6);

        int sumFirst = charOne + charTwo + charThree;
        int sumLast = charFour + charFive + charSix;

        if (sumFirst == sumLast) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }

    }
}