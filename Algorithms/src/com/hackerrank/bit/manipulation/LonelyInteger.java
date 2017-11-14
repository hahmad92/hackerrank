package com.hackerrank.bit.manipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("./TestData/BitManipulation/LonelyInteger/LonelyInteger"));
		int numbers  = in.nextInt();
		int lonelyInteger = 0;
		for (int i = 0; i < numbers; i++) {
			lonelyInteger ^= in.nextInt();
		}
		System.out.println(lonelyInteger);
		in.close();
	}

}
