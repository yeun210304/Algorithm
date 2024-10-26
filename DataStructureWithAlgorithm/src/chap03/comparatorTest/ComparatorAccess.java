package chap03.comparatorTest;

import java.util.Comparator;

public class ComparatorAccess implements Comparator<PeoplePhysc> {
    @Override
    public int compare(PeoplePhysc t1, PeoplePhysc t2) {
        return (t1.getHeight() > t2.getHeight()) ? 1 : (t1.getHeight() < t2.getHeight()) ? -1 : 0;
    }

    public int compare(int a, int b) {
        return 0;
    }
}

