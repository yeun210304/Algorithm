package chap03.classToCollection;

import java.util.HashMap;
import java.util.Map;

public class ClassToMap {
    public static void main(String[] args) {
        Map<Integer, StudentMembers> membersMap = new HashMap<>();

        membersMap.put(202401, new StudentMembers(20241101, "장원영"));
        membersMap.put(202402, new StudentMembers(20240128, "안유진"));

        System.out.println(membersMap);

        for (Map.Entry<Integer, StudentMembers> entry : membersMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        for (Map.Entry<Integer, StudentMembers> entry : membersMap.entrySet()) {
            System.out.printf("학번 %d의 이름은 %s\n", entry.getValue().getNumber(), entry.getValue().getName());
        }
    }
}
