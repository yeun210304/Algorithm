package baekjoonLevel04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLast {
	// 3052	나머지
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<Integer> lastLst = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i ++) {
			lastLst.add(in.nextInt() % 42);
		}
		in.close();

		List<Integer> resLst = lastLst.stream().distinct().collect(Collectors.toList());
		
		System.out.print(resLst.size());
	}
}
