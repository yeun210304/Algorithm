package level05;

import java.util.ArrayList;
import java.util.Scanner;

// 1152	단어의 개수
public class NumberOfKeywords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] word = in.nextLine().split(" ");
		in.close();
		
		ArrayList<String> wordArr = new ArrayList<String>();
		
		for (int i = 0; i < word.length; i++) {
			if (!"".equals(word[i])) {
				wordArr.add(word[i]);
			}
		}
		
		System.out.print(wordArr.size());
	}
}
