package chap03.classToCollection;

import java.util.Arrays;

public class ClassToArray {

    public static void main(String[] args) {
        StudentMembers[] studentMembers = {
                new StudentMembers(20241101, "장원영"),
                new StudentMembers(20240128, "안유진"),
                new StudentMembers(20240724, "레이"),
                new StudentMembers(20241021, "가을"),
                new StudentMembers(20240526, "리즈"),
        };

        System.out.println("Arrays.toString(studentMembers) : "+Arrays.toString(studentMembers));

        for (StudentMembers member : studentMembers) {
            System.out.printf("학번 %d의 이름은 %s\n", member.getNumber(), member. getName());
        }
    }
}
