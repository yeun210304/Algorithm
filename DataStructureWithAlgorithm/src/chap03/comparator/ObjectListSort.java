package chap03.comparator;

import chap03.classToCollection.StudentMembers;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ObjectListSort {
    public static void main(String[] args) {
        List<StudentMembers> memberLst = new ArrayList<>();
        memberLst.add(new StudentMembers(20241101, "장원영"));
        memberLst.add(new StudentMembers(20240128, "안유진"));
        memberLst.add(new StudentMembers(20240724, "레이"));
        memberLst.add(new StudentMembers(20241021, "가을"));
        memberLst.add(new StudentMembers(20240526, "리즈"));
        memberLst.sort(Comparator.comparing(StudentMembers::getNumber));

        // System.out.println(memberLst);

        
    }

}
