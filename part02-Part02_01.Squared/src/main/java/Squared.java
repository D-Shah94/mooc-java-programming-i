import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide a number to square: ");

        int number = Integer.valueOf(scanner.nextLine());
        System.out.println((int)(Math.pow(number, 2)));
        //System.out.println(number*number);
    }
}
