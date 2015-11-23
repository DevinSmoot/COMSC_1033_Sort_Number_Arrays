# Homework 10: Arrays
  Project 1

## Introduction:

	This program is used for taking six numbers input by the user and sorting them.
	There are methods, for loops, and arrays.
	
## Outline

```java
//Take six user input numbers.
//Store in an array
//Sort the array
//Print the array
```
## References and Literature

## Testing

```
We will sort 6 numbers that you choose.

Enter 6 numbers:
Input number 1: 55
Input number 2: 13
Input number 3: a
That's not a number! Please enter a number.
54
Input number 4: .5
That's not a number! Please enter a number.
asdf
That's not a number! Please enter a number.
15
Input number 5: 99
Input number 6: 44

The sorted array list: 
13
15
44
54
55
99
```

## Code
```java
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
```

## Console Output

We will sort 6 numbers that you choose.

Enter 6 numbers:
Input number 1: 64
Input number 2: 99
Input number 3: 99
Input number 4: 16
Input number 5: 4
Input number 6: 54

The sorted array list: 
4
16
54
64
99
99

## Command Prompt
	
*	Change to workspace and project directory
	
*	Verify on dev branch
```java
git checkout dev
```
```
H:\Documents\School\Fall 2015\Computer Science 1\Workspace\COMSC_1033_Sort_Number_Arrays>git checkout dev
M       .classpath
M       bin/Sort_Number_Arrays.class
M       src/Sort_Number_Arrays.java
Already on 'dev'
Your branch is up-to-date with 'origin/dev'.
```
*	Add all files to new commit
	
```java
git add .
```
```
H:\Documents\School\Fall 2015\Computer Science 1\Workspace\COMSC_1033_Sort_Number_Arrays>git add .
```
*	Git commit changes
```java
git commit -m "100% stable code. Ready for merge to master branch
```
```
H:\Documents\School\Fall 2015\Computer Science 1\Workspace\COMSC_1033_Sort_Number_Arrays>git commit -m "100% stable code. Ready for merge to master branch"
[dev 4319155] 100% stable code. Ready for merge to master branch
 4 files changed, 63 insertions(+), 45 deletions(-)
 create mode 100644 .settings/org.eclipse.jdt.core.prefs
 rewrite bin/Sort_Number_Arrays.class (81%)
 rewrite src/Sort_Number_Arrays.java (84%)
```
*	Change to master to merge in code
```java
git checkout master
```
``` 
H:\Documents\School\Fall 2015\Computer Science 1\Workspace\COMSC_1033_Sort_Number_Arrays>git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.
```
*	Merge changes to master branch
```java
git merge dev
```
```
H:\Documents\School\Fall 2015\Computer Science 1\Workspace\COMSC_1033_Sort_Number_Arrays>git merge dev
Updating b09ec4a..4319155
Fast-forward
 .classpath                           |   2 +-
 .settings/org.eclipse.jdt.core.prefs |   7 ++++
 bin/Sort_Number_Arrays.class         | Bin 527 -> 1725 bytes
 src/Sort_Number_Arrays.java          |  79 ++++++++++++++++++++---------------
 4 files changed, 53 insertions(+), 35 deletions(-)
 create mode 100644 .settings/org.eclipse.jdt.core.prefs
 ```
	 
## Summary
	This lesson was great for multiple inline storage into arrays and usage of arrays in 
	inline code. This can be a great beginning to mass number usage by storing information
	in arrays and pulling it quickly when needed. It can also hold settings for future
	programs. This is going to be an expansion in the future for just such a use. Also
	passing the array to a method allows that method to change the array or use the array
	if needed.
	