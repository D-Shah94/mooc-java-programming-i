
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());

        if (isLeapYear(year)) { //calling a method and verify the result via the unit tests
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }



//        if ((year % 400 != 0) && (year % 100 == 0)) {
//            System.out.println("This year is not a leap year.");
//        } else if (year % 4 == 0) {
//            System.out.println("This year is a leap year.");
//        } else {
//            System.out.println("This year is not a leap year.");
//        }
    }

    public static boolean isLeapYear(Integer year) { //create a test for a null integer
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
// alternative		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
}
