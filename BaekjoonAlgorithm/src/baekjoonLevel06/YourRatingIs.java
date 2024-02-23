package baekjoonLevel06;

import java.util.Scanner;

// 25206	너의 평점은
public class YourRatingIs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[][] score = new String[20][3];
		
		int scLen = score.length;
		int sum = 0;
		int pNum = 0;;
		
		float rating = 0;
		
		for (int i = 0; i < scLen; i++) {
			score[i][0] = in.next();
			score[i][1] = in.next();
			score[i][2] = in.next();
			
			if ("P".equals(score[i][2]) || "F".equals(score[i][2])) {
				score[i][1] = "0";
				pNum++;
			}
			
			sum += Double.parseDouble(score[i][1]);
		}
		
		rating = sum / (scLen - pNum);

		System.out.println(rating);
	}
}
