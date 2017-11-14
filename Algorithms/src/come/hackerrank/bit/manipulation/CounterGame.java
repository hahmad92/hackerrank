package come.hackerrank.bit.manipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CounterGame {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("./TestData/BitManipulation/input10.txt"));
		int testCases = in.nextInt();
	
		for (int i = 0; i < testCases; i++) {

			int richard = 0;
			int louise = 1;
			long number = in.nextLong();

			while (true) {
				if (number == 1) {
					if (louise == 1) {
						System.out.println("Richard");
						break;
					} else if (richard == 1) {
						{
							System.out.println("Louise");
							break;
						}
					}
				}
				if ((number & number - 1) == 0) {
					number = number / 2;
				} else {
					long num = number;
					int j = 0;
					while (true) {
						if (num <= 1)
							break;
						num = num / 2;
						j++;
					}
					number -= Math.pow(2, j);
				}
				if (louise == 1) {
					richard = 1;
					louise = 0;
				} else if(richard == 1){
					richard = 0;
					louise = 1;

				}
			}
		}
		in.close();
	}

}
