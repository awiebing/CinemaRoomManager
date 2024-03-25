import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        // System.out.println("Enter a city name?");
        String cityName = scanner.nextLine();
        boolean endWithBurg = cityName.endsWith("burg");
        // System.out.println("You entered the name: " + cityName);
        System.out.println(endWithBurg);
    }
}