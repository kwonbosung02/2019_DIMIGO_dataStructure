package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src = {"서울","대전","대구","부산"};
        System.out.println(Arrays.toString(src));

        String[] dest = Arrays.copyOf(src,src.length);
        System.out.println(Arrays.toString(dest));

        System.out.println(src == dest);
        System.out.println(Arrays.equals(src,dest));
        Arrays.sort(dest);
        System.out.println(Arrays.binarySearch(dest,"부산"));

    }
}
