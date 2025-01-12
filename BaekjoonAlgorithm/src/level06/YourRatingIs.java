package level06;

import java.util.Scanner;

// 25206	너의 평점은
public class YourRatingIs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double scoreSum = 0;	// 학점의 총합
		double multiSum = 0;	// 학점 * 과목평점
		
		String[] gradeArr = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
		double[] rateArr = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
		
		
		for (int i = 0; i < 20; i++) {
			in.next();	// 과목명
			double score = in.nextDouble();	// 학점
			String grade = in.next();	// 등급
			double sbjRate = 0;
					
			// 과목평점찾기
			for (int j = 0; j < gradeArr.length; j++) {
				if (gradeArr[j].equals(grade)) {
					sbjRate = rateArr[j];
				}
			}
			
			if ("P".equals(grade)) {
				score = 0;
			}
			
			scoreSum += score;
			multiSum += score * sbjRate; 
		}
		in.close();

		System.out.printf("%.6f\n", multiSum / scoreSum);
	}
}