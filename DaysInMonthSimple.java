/*Days in Month Considering Leap Year
Scenario: Take a year and month number, print days in that month considering leap years.
Input:
Enter year: 2024
Enter month number: 2
Output:
29 days*/

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        int days = 0;

        if (month == 1 || month == 3 || month == 5 || month == 7 || 
            month == 8 || month == 10 || month == 12) {
            days = 31;
            System.out.println("Month has 31 days");
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
            System.out.println("Month has 30 days");
        } 
        else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days = 29;
                System.out.println("February in leap year → 29 days");
            } else {
                days = 28;
                System.out.println("February in non-leap year → 28 days");
            }
        } 
        else {
            System.out.println("Invalid month number");
            sc.close();
            return;
        }

        System.out.println("Total days: " + days);
        sc.close();
    }
}
