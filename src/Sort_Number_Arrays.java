/* Project:		Homework 10: Sorting 6 numbers
 * Author:		Devin Smoot
 * Date:		2015-11-18
 */

import java.util.Scanner;
import java.util.Arrays;
public class Sort_Number_Arrays {
	public static void main(String[] args) {
		//State program purpose
		System.out.println("We will sort 6 numbers that you choose.");
		
		System.out.println("\nEnter 6 numbers:");
		
		//Set up arrays to hold 6 integers
		int[] numbers = new int[6];
		//Call inputNumbers method
		inputNumbers(numbers);
		
		//Sort the array using java utilities
		Arrays.sort(numbers);
		
		//Call printArray method
		printArray(numbers);
		
	}//End main method
	public static void printArray (int numbers[]){
		//And output them with a for loop
				System.out.print ("\nThe sorted array list: \n");
				for(int i=0;i < numbers.length; i++){
					System.out.println(numbers[i]);
				}//End FOR
	}//End printArray method
	
	public static void inputNumbers (int numbers[]){
		//Define local variables
		int userNumber;
		//Set up scanner input
		Scanner input = new Scanner(System.in);
		//FOR loop to take inputs and place in the array
		for (int i =0;i<6;i++){
		System.out.print ("Input number "+ (i+1) + ": ");		
		//Take input and validate that input is an integer
			do {
				while (!input.hasNextInt()) {
		           System.out.println("That's not a number! Please enter a number.");
		           input.next(); // this is important!
		        }//End WHILE
			 userNumber = input.nextInt(); // this is important!
			}while (userNumber <= 0);//End DO
		numbers[i] = userNumber;
		}//End FOR
	}//End inputNumbers method
	
}