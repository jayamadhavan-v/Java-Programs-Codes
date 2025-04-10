import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();
       if(isLeapYear(year)) {
           System.out.print(year + " is Leap year");
       } else System.out.print(year + " is not Leap Year");
    }
    public static boolean isLeapYear(int year) {

        // if year is less than 1 or greater than 9_999, it's invalid,
        // so return false
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
