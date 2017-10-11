package pattern;

public class Pattern3 {

	public static void main(String[] args) {

	int range =4;
		
		for (int i = 1; i <=range; i++) {
			for (int j = 1; j <=range; j++) {
				if( i==1 || i==4 || j==1 || j==4)
				System.out.print("* ");
				else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}


/*

a
ab
bac
abcd
cabde
eadcbf﻿


1234
2341
3241
4321

*/