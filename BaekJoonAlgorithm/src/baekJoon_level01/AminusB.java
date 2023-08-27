package baekJoon_level01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1000	A+B
public class AminusB {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		
		System.out.print(firstNumber - secondNumber);
		
		AminusB aMinusB = new AminusB();
        
		List<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(scanner.nextInt());
		numbersList.add(scanner.nextInt());
		
		if (numbersList.size() == 2) aMinusB.printNumber(numbersList);
	}
	
	public void printNumber(List<Integer> numbers) {
		int firstNumber  = numbers.get(0) == null ? 0 : numbers.get(0);
		int secondNumber = numbers.get(1) == null ? 0 : numbers.get(1);
		
		System.out.printf("%d", firstNumber - secondNumber);
	}
}
