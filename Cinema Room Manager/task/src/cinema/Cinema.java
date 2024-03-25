package cinema;

import java.util.Scanner;

public class Cinema {


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numSeats = scanner.nextInt();

        char[][] cinema = new char[numRows][numSeats];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeats; j++) {
                cinema[i][j] = 'S';
            }
        }

        int loopMenu;

        do {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            loopMenu = scanner.nextInt();

            if (loopMenu == 1) {
                showSeats(cinema);
            }
            else if (loopMenu == 2) {
                updateSeats(cinema);
            } else if (loopMenu == 3) {
                statistics(cinema);
            }

        } while (loopMenu != 0);
    }


    
    public static void statistics(char[][] cinema) {
        int purchasedTickets = 0;

        for (char[] val : cinema) {
            for (char elem : val) {
                if (elem == 'B') {
                    purchasedTickets++;
                }
            }
        }
        System.out.println("Number of purchased tickets: " + purchasedTickets);

        int row = cinema.length;
        int seat = cinema[0].length;
        int totalSeats = row * seat;

        float percentageOfTickets = (float) purchasedTickets / totalSeats * 100;

        System.out.printf("Percentage: %.2f%%", percentageOfTickets);
        System.out.println();

        int currentIncome = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < seat; j++) {
                if (cinema[i][j] == 'B') {
                    currentIncome += i >= row / 2 ? 8 : 10;     // foutmelding zou kunnen met helft berekening!
                }
            }
        }

        System.out.println("Current income: $" + currentIncome);

        if(totalSeats < 60) {
            System.out.println("Total income: " + "$" + (totalSeats * 10));
        } else if (totalSeats > 60) {
            if (row % 2 == 0) {
                int frontHalf = row / 2;
                int backHalf = row / 2;

                System.out.println("Total income: " + "$" + ((frontHalf * seat * 10) + (backHalf * seat * 8)));
            } else if (row % 2 != 0) {
                int frontHalf = row / 2;
                int backHalf = row / 2 + 1;
                System.out.println("Total income: " + "$" + ((frontHalf * seat * 10) + (backHalf * seat * 8)));
            }
        }

    }
    
    public static void updateSeats(char[][] cinema) {

        int pickRow = 0;
        int pickSeat = 0;

        Scanner scanner = new Scanner(System.in);

        int row = cinema.length;
        int seat = cinema[0].length;

        do {
            System.out.println("Enter a row number:");
            pickRow = scanner.nextInt();

            System.out.println("Enter a seat number in that row:");
            pickSeat = scanner.nextInt();

            if (pickRow > cinema.length || pickSeat > cinema[0].length) {
                System.out.println("Wrong input!");
            } else if (cinema[pickRow - 1][pickSeat - 1] == 'B') {
                System.out.println("That ticket has already been purchased!");
            }
        } while (pickRow > cinema.length || pickSeat > cinema[0].length || cinema[pickRow - 1][pickSeat - 1] == 'B');

        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if ((i + 1 == pickRow && j + 1 == pickSeat)) {
                    cinema[i][j] = 'B';
                } else {
                    if (cinema[i][j] == 'B') {
                        continue;
                    }
                    cinema[i][j] = 'S';
                }
            }
        }

        int totalSeats = row * seat;
        int ticketPrice;
        if (totalSeats < 60) {
            ticketPrice = 10;
            System.out.println("Ticket price: $" + ticketPrice);
        } else if (totalSeats > 60) {
            if (pickRow % 2 == 0) {
                int row_half = row / 2;
                if (pickRow <= row_half) {
                    ticketPrice = 10;
                    System.out.println("Ticket price: $" + ticketPrice);
                } else {
                    ticketPrice = 8;
                    System.out.println("Ticket price: $" + ticketPrice);
                }

            } else if (pickRow % 2 != 0) {
                int row_half = row / 2;
                if (pickRow <= row_half) {
                    ticketPrice = 10;
                    System.out.println("Ticket price: $" + ticketPrice);
                } else {
                    ticketPrice = 8;
                    System.out.println("Ticket price: $" + ticketPrice);
                }
            }
        }

    }

    public static void showSeats (char[][] cinema) {
        System.out.println("Cinema: ");

        int row = cinema.length;
        int seat = cinema[0].length;

        for (int i = 1; i <= seat; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < seat; j++) {

                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }

    }

}





