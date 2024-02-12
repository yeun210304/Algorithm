package baekjoonLevel06;

import java.util.Scanner;

// 1316	그룹 단어 체커
public class GroupWordCheckers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());
		int res = 0;

		String[] sArr = new String[n];

		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = in.nextLine();

			String word = sArr[i];
			
			boolean gw = true;
			
			StringBuffer sb = new StringBuffer();
			
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(j) != (j + 1 != word.length() ? word.charAt(j + 1) : word.length())) {
					sb.append(word.charAt(j));
				}
			}
			
			word = sb.toString();

			for (int j = 0; j < word.length(); j++) {
				String c = "" + word.charAt(j);
				String lastWord = word.substring(j + 1, word.length());

				if (lastWord.indexOf(c) > -1) {
					gw = false;
				}
			}
			
			if (gw) {
				res++;
			}
		}

		System.out.print(res);
	}
}
