package com.Generator.RandomGenerator;

public class RandomNumberGenerator {

	public static void main(String[] args) {

		int a = 13;
		int c = 1;
		int m = 32;
		int arr[] = new int[65];
		
		for (int i = 0; i < m * 2; i++) {
			 
			arr[i + 1] = ((a * arr[i]) + c) % m;
		}

		for (int i = 0; i < m; i++) {

			System.out.print("arr[" + i + "] = " + arr[i] + "  arr["+(i+m)+"] = " + arr[i + m]);
			System.out.println();
		}
	}
}
