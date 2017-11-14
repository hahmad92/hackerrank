package com.hackerrank.bit.manipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximizingXOR {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("./TestData/BitManipulation/MaximizingXOR/MaximizingXOR"));
		int left = in.nextInt();
		int right = in.nextInt();
		int max = 0;

		int a = left;
		int b = 0;
		while (a <= right) {
			b = a;
			while(b <= right){
				int temp = a ^ b;
				if(temp > max)
					max = temp;
				b++;
			}
			a++;
		}
		System.out.println(max);
		in.close();

	}

}
