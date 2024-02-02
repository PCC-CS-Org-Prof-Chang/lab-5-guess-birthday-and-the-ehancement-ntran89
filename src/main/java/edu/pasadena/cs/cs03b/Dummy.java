package edu.pasadena.cs.cs03b;
import java.lang.Math;
import java.util.Scanner;

public class Dummy {

	public static void main(String[] args) {
		int set1n[][] = {
			{1}, 
		  };
		  int set2n[][] = {
			{1, 3},
			{2, 3} 
		  };
		  int set3n[][] = {
			{1, 3, 5, 7},
			{2, 3, 6, 7},
			{4, 5, 6, 7}
		  };
		// TODO: add you logic here
		Scanner sc = new Scanner(System.in);

		// Ask user for number to get sets
		System.out.print("Enter your integer range (1-255): ");
		int n = sc.nextInt() + 1;

		int setNum = log2(n); // Gets the log base 2 of the number of n and gets the ceiling of it to get the number of sets
		int setarr[][] = generateSets(setNum); //Generates the sets
		int binary[] = new int[setNum]; //Sets up the binary array to store the binary digits (Keep in mind the number order is stored reversed in the array)
		int input; //Variable to store the user input

		// Generate sets
		// Print sets
			for (int i = 0; i < setNum; i++) { // Looks at each set
				for (int j = 0; j < setarr[i].length; j++) { //Prints number in set
					System.out.print(setarr[i][j] + ", ");
				}
				System.out.println();
				System.out.print("Enter your number to see if it's in your set: "); //Asks user if their number is in the set
				input = sc.nextInt();
				binary[i] = secretSearch(setarr, input, i);
				System.out.println(); //Ends the line to seperate the sets
			}
			System.out.println(binArrtoDec(binary) + " is your number."); //Prints the decimal number of the binary array
			sc.close();
		}

		public static int dummy() {
		// TOOD: add your logic here
		return 1;
	}

	public static int log2(int x) { // Function to get the log base 2 of a number and rounds up
		return (int) Math.ceil((Math.log(x) / Math.log(2)));
	}

	public static int binArrtoDec(int[] arr) { // Function to convert a binary array to a decimal number
		double dec = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			dec += arr[i] * Math.pow(2, i);
		}
		return (int) dec;
	}

	public static int secretSearch(int[][] arr, int target, int setNum) { // Gets number of appearences of a number target number in a set
		int appearences = 0;
		for (int j = 0; j < arr[setNum].length; j++) {
			if (arr[setNum][j] == target) {
				appearences++;
			}
		}
		if (appearences == 0) {
			System.out.println("Your number is not in the set.");
		} else {
			System.out.println("Your number is in the set.");
		}
		return appearences;
	}

	public static int[][] generateSets(int setNum) {
		int setlength = (int) (Math.pow(2, setNum) / 2); // Gets the length of the set by using the formula 2^setNum/2
		int largetNumInSet = (int) Math.pow(2, setNum); //Larget number in the set is 2^setNum
		int setofSets[][] = new int[setNum][setlength];
		for (int i = 0; i < setNum; i++) { // Populates each set
			int index = 0;
			for (int j = 0; j <= largetNumInSet; j++) { // Iterates through the numbers from 0 to the largest number in the set
				if ((j & (int) Math.pow(2, i)) != 0) { //Checks to see if that number is in our set based on set number
					setofSets[i][index] = j;
					index++;
				}
			}
		}
		return setofSets;
	}

	public static void printSet(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
