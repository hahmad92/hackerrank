package com.hackerrank.bit.manipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XorSequence {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("./TestData/BitManipulation/XorSequence/XorSequence"));
		sulution3(in);
		in.close();
		
	}
	static void sulution1(Scanner in ){
		long maxNumber = (long) Math.pow(10, 5);
		List<Integer> list = new ArrayList<>();
		list.add(0);
		for (int i = 1; i < maxNumber; i++) {
			list.add(list.get(i - 1) ^ i);
		}
		int Q = in.nextInt();
		for (int a0 = 0; a0 < Q; a0++) {
			long L = in.nextLong();
			long R = in.nextLong();

			int result = 0;
			for (long i = L; i <= R; i++) {
				result ^= list.get((int) i);
			}
			System.out.println(result);
		}
	}
	
	static void sulution2(Scanner in ){
		int Q = in.nextInt();
		for (int a0 = 0; a0 < Q; a0++) {
			long L = in.nextLong();
			long R = in.nextLong();
			
			long xorL = 0;
			for (long i = 1; i <= L; i++) {
				xorL = xorL ^ i;
			}
			
			int result = 0;
			for (long i = L; i <= R; i++) {
				result ^= xorL;
				xorL = xorL ^ i + 1;
			}
			System.out.println(result);
		}
	}
	
	static void sulution3(Scanner in ){
		int Q = in.nextInt();
		for (int a0 = 0; a0 < Q; a0++) {
			long L = in.nextLong();
			long R = in.nextLong();
			
			long xorL = computeXOR(L);
			
			int result = 0;
			for (long i = L; i <= R; i++) {
				result ^= xorL;
				xorL = xorL ^ i + 1;
			}
			System.out.println(result);
		}
	}
	static long computeXOR(long n)
	{
	    // If n is a multiple of 4
	    if (n % 4 == 0)
	        return n;
	 
	    // If n%4 gives remainder 1
	    if (n % 4 == 1)
	        return 1;
	 
	    // If n%4 gives remainder 2
	    if (n % 4 == 2)
	        return n + 1;
	 
	    // If n%4 gives remainder 3
	    return 0;
	}

}
