package chap03.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import chap03.classToCollection.StudentMembers;

// import chap03.classToCollection.StudentMembers;

public class KindOfArraySort {
    public static void main(String[] args) {
        int[] numbers = {9,5,3,7,4,6,1,8,2};
        System.out.println("원본값 : " + Arrays.toString(numbers));

        int[] num1 = numbers.clone();
        Arrays.sort(num1);                          // 오름차순 정렬
        System.out.println("Arrays.sort(numbers) : " + Arrays.toString(num1));

        int[] num2 = numbers.clone();
        Arrays.sort(num2, 0, 5);    // 구간 정렬
        System.out.println("Arrays.sort(num2, 0, 5) : " + Arrays.toString(num2));

        // 수동정렬
        // Integer[] num3 = new Integer[numbers.length];
        
        // for (int i = 0; i < num3.length; i++) {
        //     num3[i] = numbers[i];
        // }

        Integer[] num3 = Arrays.stream(numbers).boxed().toArray(Integer[]:: new);
        Arrays.sort(num3, Collections.reverseOrder());
        System.out.println("Arrays.sort(num3, Collections.reverseOrder()) : " + Arrays.toString(num3));

        StudentMembers[] students = {
            new StudentMembers(20241101, "장원영"),
            new StudentMembers(20240128, "안유진"),
            new StudentMembers(20240724, "레이"),
            new StudentMembers(20241021, "가을"),
            new StudentMembers(20240526, "리즈"),
        };

          // 학번을 기준으로 오름차순 정렬
        Arrays.sort(students, (o1, o2) -> Integer.compare(o1.getNumber(), o2.getNumber()));


        for (StudentMembers studentMembers : students) {
            System.out.println(studentMembers);
        }


        
    }
}
