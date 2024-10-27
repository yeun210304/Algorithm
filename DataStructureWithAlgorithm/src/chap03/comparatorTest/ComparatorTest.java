package chap03.comparatorTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ComparatorTest {
    
    private static final Comparator<PeoplePhysc> HEIGHT_ORDER = new ComparatorAccess();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PeoplePhysc[] x = {
            new PeoplePhysc("가나다", 161, 1.0),
            new PeoplePhysc("라마바", 162, 1.1),
            new PeoplePhysc("사아자", 163, 1.3)
        };

        System.out.print("찾고자 하는 값을 입력하시오 : ");
        int ky = sc.nextInt();
        sc.close();

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // 나이 기준 오름차순 정렬
        people.sort(Comparator.comparingInt(person -> person.age));
        System.out.println("오름차순 정렬: " + people);

        people.sort(null);

        int idx = Arrays.binarySearch(x, new PeoplePhysc("", ky, 0.0), HEIGHT_ORDER);
        
        if (idx < 0)
            System.out.println("요소가 없습니다.");
        else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("일치 데이터 : " + x[idx]);
        }
    }

}


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}