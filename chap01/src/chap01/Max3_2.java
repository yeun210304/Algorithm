package chap01;

import java.util.Scanner;

public class Max3_2 {

	public static void main(String[] args) {
		// 실인수 argument
		System.out.println("-------max3-------");
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(1,3,2) = " + max3(1,3,2));
		System.out.println("max3(2,3,1) = " + max3(2,3,1));
		System.out.println("max3(3,1,2) = " + max3(3,1,2));
		System.out.println("-------max4-------");
		System.out.println("max4(7,8,5,6) = " + max4(7,8,5,6));
		System.out.println("-------min3-------");
		System.out.println("min3(6,2,4) = " + min3(6,2,4));
		System.out.println("-------min4-------");
		System.out.println("min4(9,5,4,7) = " + min4(9,5,4,7));
	}
	
	static int max3(int a, int b, int c) {
		// 매개변수 parameter
		int max = a;
		if(b > max)
			max = b;
		if (c > max)
			max = c;
		
		return max;
	}
	
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		if(d > max)
			max = d;
		
		return max;
	}
	
	static int min3(int a, int b, int c) {
		
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		
		return min;
	}
	
	static int min4(int a, int b, int c, int d) {

		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		if(d < min)
			min = d;
		
		return min;
	}
}

















