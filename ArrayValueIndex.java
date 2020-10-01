package edu.ben.cmsc2200.lab5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValueIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of values: ");
		int a = input.nextInt();

		double[] myArray = new double[a];

		System.out.println("Please enter the values: ");

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = input.nextDouble();
		}

		int b = indexOfLowestValue(myArray);
		
		System.out.println("Lowest Value is " + myArray[b]  + " at " + b);
		
	}
	public static int indexOfLowestValue(double[] value) {
		double min = value[0];
		int minIndex = 0;
		for (int i = 0; i < value.length; i++) {
			if (value[i] < min) {
				minIndex = i;
			}
		}
		return minIndex;
	}
}
