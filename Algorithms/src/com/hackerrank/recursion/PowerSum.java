package com.hackerrank.recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class PowerSum {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("./TestData/Recursion/PowerSum/PowerSum"));
		int X = in.nextInt();
		int N = in.nextInt();
		int size = (int) Math.pow(25, 1.0 / N);
		int lookupArray[] = new int[size];
		for (int i = 0; i < lookupArray.length; i++) {
			lookupArray[i] = (int) Math.pow(i, N);
		}
		for (int i = 0; i < lookupArray.length; i++) {

		}
		System.out.println(Arrays.toString(lookupArray));
		in.close();

	}

}
