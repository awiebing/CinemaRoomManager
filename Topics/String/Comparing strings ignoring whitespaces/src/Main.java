import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here


        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();




        if (line1.replaceAll(" ", "").equals(line2.replace(" ", ""))){
            System.out.println("true");
        } else {
            System.out.println("false");
        }



    }
}