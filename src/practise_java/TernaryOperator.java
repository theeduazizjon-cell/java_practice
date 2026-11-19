// Ternary Operators 
// Consider it like this: 
// if --> ? 
// else --> :


// Question1
/**
 Find the largest and smallest of the three-integer number.
 Use the ternary operator with single statement of comparison.
 Take the input from the user.
 */
package practise_java;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] abs) {
		Scanner stdIn = new Scanner(System.in); 
		
		System.out.println("You need to enter three inetgers: "); 
		
		System.out.println("Enter integer number 1: "); 
		int num1 = stdIn.nextInt(); 
		
		System.out.println("Enter integer number 2: "); 
		int num2 = stdIn.nextInt(); 
		
		System.out.println("Enter integer number 3: "); 
		int num3 = stdIn.nextInt(); 
		
		int largest = (num1 > num2) ? (num1 > num2 ? num1 : num2) : (num2 > num3 ? num2 : num3); 
		int smallest = (num1 < num2) ? (num1 < num2 ? num1 : num2) : (num2 < num3 ? num2 : num3);
		
		System.out.println("The largest number among these three numbers is: " + largest + "\n"); 
		System.out.println("The smallest number among these three numbers is: " + smallest + "\n");
	}
}

