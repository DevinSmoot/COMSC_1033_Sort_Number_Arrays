import java.util.*;

public class Sort_Number_Arrays {
	public static void main(String[] args) {
		System.out.println("Hello class, this is a sorting algorithm using arrays.");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		
		System.out.print("Your first number:");
		int n1 = userInput.nextInt();
		
		System.out.print("Your second number:");
		int n2 = userInput.nextInt();
		
		System.out.print("Your third number:");
		int n3 = userInput.nextInt();
		
		//Begin Arrays
		
		//Create a new array of 3 ints
		int[] numbers = new int[3];
		
		/*
		Arrays have an index that start with 0
		and end with their length minus 1 such that
		an array of 3 ints will have an index from 0-2
		*/
		
		//Here we assign values to each index
		numbers[0] = n1;
		numbers[1] = n2;
		numbers[2] = n3;
		
		//And sort them
		Arrays.sort(numbers);
		
		//And output them with a for loop
		for(int i=0;i < numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}
}