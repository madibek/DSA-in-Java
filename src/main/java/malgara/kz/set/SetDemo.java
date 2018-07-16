package malgara.kz.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set set1 = new HashSet();
        set1.add(3);
        set1.add(5);
        set1.add(3);
        set1.add(1);

        Set set2 = new HashSet();
        set2.add(3);
        set2.add(7);
        set2.add(8);
        set2.add(5);

        System.out.println("Set1: " + set1);

        System.out.println("Set2: " + set2);

        Set union = union(set1, set2);
        System.out.println("Union: " + union);

        Set intersecton = intersection(set1, set2);
        System.out.println("Intersecton: " + intersecton);

        Set complement = complement(set2, set1);
        System.out.println("Complement: " + complement);


    }

    private static Set complement(Set set1, Set set2) {

        if (set1 == null) {
            return Collections.emptySet();
        }

        Set intersection = intersection(set1, set2);
        set1.removeAll(intersection);

        return set1;
    }

    private static Set intersection(Set set1, Set set2) {

        Set result = new HashSet();
        if (set1 == null || set2 == null) {
            return result;
        }

        Set small;
        Set big;

        if (set1.size() < set2.size()) {
            small = set1;
            big = set2;
        } else {
            small = set2;
            big = set1;
        }

        for (Object item : small) {
            if (big.contains(item)) {
                result.add(item);
            }

        }

        return result;
    }

    private static Set union(Set set1, Set set2) {

        Set result = new HashSet();

        if (set1 == null || set2 == null) {
            return result;
        }

        for (Object item : set1) {
            result.add(item);
        }

        for (Object item : set2) {
            result.add(item);
        }

        return result;
    }
}
