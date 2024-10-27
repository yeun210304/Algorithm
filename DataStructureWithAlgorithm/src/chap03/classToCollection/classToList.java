package chap03.classToCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class classToList {

    public static void main(String[] args) {
        StudentMembers[] studentMembers = {
                new StudentMembers("장원영", 20241101),
                new StudentMembers("안유진", 20240128),
                new StudentMembers("레이", 20240724),
                new StudentMembers("가을", 20241021),
                new StudentMembers("리즈", 20240526),
        };

        System.out.println("Arrays.toString(studentMembers) : "+Arrays.toString(studentMembers));

        for (StudentMembers member : studentMembers) {
            System.out.printf("학번 %d의 이름은 %s\n", member.getNumber(), member. getName());
        }
        



    }

}
