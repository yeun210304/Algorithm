package chap03;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class PhysExamSearch {

    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrrderComparator();

        private static class HeightOrrderComparator implements Comparator<PhyscData> {
            // ! java.util의 Comparator클래스를 상속받으면 필수로 compare메서드를 생성해야 한다.
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
            new PhyscData("이나령", 162, 0.3),
			new PhyscData("유지훈", 168, 0.4),
			new PhyscData("김한결", 169, 0.8),
			new PhyscData("홍준기", 171, 1.5),
			new PhyscData("전서현", 173, 0.7),
			new PhyscData("이호연", 174, 1.2),
			new PhyscData("이수민", 175, 2.0)
        };
        
        System.out.print("키가 몇 cm인 사람을 찾고 있나요? : ");
        int height = sc.nextInt();
        sc.close();

        int idx = Arrays.binarySearch(
            x, 
            new PhyscData("", height, 0.0),
            PhyscData.HEIGHT_ORDER                      // HEIGHT_ORDER 를 이용해 검색
        );

        if (idx < 0)
            System.out.println("요소가 없습니다.");
        else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("일치 데이터 : " + x[idx]);
        }
    }
}
