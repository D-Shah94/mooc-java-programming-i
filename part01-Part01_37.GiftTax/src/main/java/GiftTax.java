
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());

        if (giftValue >= 5000 && giftValue < 25000) {
            int taxLowerLimit = 100;
            double taxRate = 0.08;
            System.out.println("Tax: " + (taxLowerLimit + taxRate * (giftValue - 5000)));
        } else if (giftValue >= 25000 && giftValue < 55000) {
            int taxLowerLimit = 1700;
            double taxRate = 0.1;
            System.out.println("Tax: " + (taxLowerLimit + taxRate * (giftValue - 25000)));
        } else if (giftValue >= 55000 && giftValue < 200000) {
            int taxLowerLimit = 4700;
            double taxRate = 0.12;
            System.out.println("Tax: " + (taxLowerLimit + taxRate * (giftValue - 55000)));
        }  else if (giftValue >= 200000 && giftValue < 1000000) {
            int taxLowerLimit = 22100;
            double taxRate = 0.15;
            System.out.println("Tax: " + (taxLowerLimit + taxRate * (giftValue - 200000)));
        } else if (giftValue >= 1000000) {
            int taxLowerLimit = 142100;
            double taxRate = 0.17;
            System.out.println("Tax: " + (taxLowerLimit + taxRate * (giftValue - 1000000)));
        } else {
            System.out.println("No tax!");
        }
    }
}
