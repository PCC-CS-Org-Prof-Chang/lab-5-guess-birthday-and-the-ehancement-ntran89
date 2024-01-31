package edu.pasadena.cs.cs03b;
import java.lang.Math;

public class Dummy {

	public static void main(String[] args) {
		// TODO: add you logic here
		int setarr[][] = new int[8][128];
		// Generate sets
		for (int i = 0; i < 8; i++) {
			int index = 0;
			for (int j = 0; j <= 256; j++) {
				if ((j & (int) Math.pow(2, i)) != 0) {
					setarr[i][index] = j;
					index++;
				}
			}
		}
		// Print sets
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 128; j++) {
				System.out.print(setarr[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}

	public static int dummy() {
		
		
		// TOOD: add your logic here

		return 1;
	}

}
