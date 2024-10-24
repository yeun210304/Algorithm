package chap01;

import java.util.Scanner;

public class Medium {

	/*
	
	�߾Ӱ��� ���غ���!
	
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	*/
	
	static int med3(int a, int b, int c) {
		if ((b >= a && c<= a) || (b <=a && c >= a))
			return a;
		else if ((a > b && c< b) || (a < b && c >b))
			return b;
		return c;
	}
	
	static int medium3(int a, int b, int c) {
		if (a >= b)
			if (b <= c)
				return b;
			else if (a <= c)
				return a;
			else 
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.println("a�� ��: ");
		int a = stdIn.nextInt();
		System.out.println("b�� ��: ");
		int b = stdIn.nextInt();
		System.out.println("c�� ��: ");
		int c = stdIn.nextInt();
		stdIn.close();
		
		System.out.println("�߾Ӱ��� " + med3(a, b, c) + "�Դϴ�.");
		System.out.println("�߾Ӱ��� " + medium3(a, b, c) + "�Դϴ�.");
	}
}
