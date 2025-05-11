import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double scoreSum = 0;	// 학점의 총합
		double multiSum = 0;	// 학점 * 과목평점
		
		List<String> gradeLst = Arrays.asList("A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P");
		double[] rateArr = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
		
		for (int i = 0; i < 20; i++) {
			sc.next();
			double score = sc.nextDouble();
			String grade = sc.next();
			
			if ("P".equals(grade)) {
				score = 0;
			}
			
			scoreSum += score;
			multiSum += score * rateArr[gradeLst.indexOf(grade)]; 
		}
		sc.close();

		System.out.printf("%.6f\n", multiSum / scoreSum);
	}
}