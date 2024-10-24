package baekjoonLevel01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//1000	A+B
public class AplusB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		AplusB aPlusB = new AplusB();

		List<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(scanner.nextInt());
		numbersList.add(scanner.nextInt());
		scanner.close();
		
		if (numbersList.size() == 2) aPlusB.printAddNumbers(numbersList);
	}
	
	public void printAddNumbers(List<Integer> inputNumbers) {
		int sum = 0;
		
		Iterator<Integer> numberIter = inputNumbers.iterator();
		
		while (numberIter.hasNext()) sum += numberIter.next();
		
		System.out.printf("%d", sum);
	}
}