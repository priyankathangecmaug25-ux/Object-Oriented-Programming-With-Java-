/*Scenario: Take a 4-digit number and print its reverse.
Input:
Enter 4-digit number: 1234
Output:
Reversed number: 4321*/

import java.util.Scanner;

class ReverseArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
		
		// Input digits into array
        System.out.println("Enter " + n + " digits:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print reversed array
        System.out.print("Reversed digits: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}
