package chap03.classToCollection;

import java.util.ArrayList;
import java.util.List;

public class ClassToList {

    public static void main(String[] args) {
        List<StudentMembers> memberLst = new ArrayList<>();

        memberLst.add(new StudentMembers(20241101, "장원영"));
        memberLst.add(new StudentMembers(20240128, "안유진"));
        memberLst.add(new StudentMembers(20240724, "레이"));
        memberLst.add(new StudentMembers(20241021, "가을"));
        memberLst.add(new StudentMembers(20240526, "리즈"));
        
        System.out.println(memberLst);

        for (StudentMembers member : memberLst) {
            System.out.println(member);
        }

        for (StudentMembers member : memberLst) {
            System.out.printf("학번 %d의 이름은 %s\n", member.getNumber(), member. getName());
        }

    }
}
