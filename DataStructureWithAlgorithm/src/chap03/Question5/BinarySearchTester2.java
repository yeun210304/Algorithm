package chap03.Question5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BinarySearchTester2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> lst = new ArrayList<Integer>();

        for (int i = 0; i < 7; i++) {
            lst.add(i, random.nextInt(20));
        }

        lst.sort(null);
        int idx = Collections.binarySearch(lst, 3);
        System.out.println("index : " + idx);
    }
}
