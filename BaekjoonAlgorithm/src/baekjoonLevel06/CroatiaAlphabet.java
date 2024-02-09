package baekjoonLevel06;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 	2941	크로아티아 알파벳
public class CroatiaAlphabet {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String word = in.next();
		in.close();
		
		final String[] cr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		int cnt = 0;
		
		for (int i = 0; i < cr.length; i++) {
			Pattern p = Pattern.compile(cr[i]);
			Matcher m = p.matcher(word);
			
			while (m.find()) {
				cnt++;
			}
			
			word = word.replace(cr[i], " ");
		}
		
		System.out.print(cnt + word.replace(" ", "").length());
	}
}
