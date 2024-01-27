package baekjoonLevel05;

import java.util.HashMap;
import java.util.Scanner;

// 5622	다이얼
public class DialPhone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int res = 0;
		
		String s = "";
		String call = in.next();
		in.close();
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for (char i = 'A'; i <= 'Z'; i++) {
			if (7 > b && a % 3 == 0) {
				s = "";
				b++;
			}
			else if (i == 'T' || i == 'W') {
				s = "";
				b++;
			}
			
			s += Character.toString(i);
			
			map.put(b, s);
			
			a++;
		}
		
		for (int i = 0; i < call.length(); i++) {
			for (int j = 2; j <= map.size() + 1; j++) {
				if (map.get(j).indexOf(Character.toString(call.charAt(i))) > -1) {
					res += j + 1;
				}
			}
		}
		
		System.out.println(res);
	}
}
