package com.arun.array;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayUsingUsersInputs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Arrya");
		int size = sc.nextInt();

		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Array Values ::: ");
			array[i] = sc.nextInt();

		}
		sc.close();
		System.out.println("Your Array is ::: "+ Arrays.toString(array));
	}

}
