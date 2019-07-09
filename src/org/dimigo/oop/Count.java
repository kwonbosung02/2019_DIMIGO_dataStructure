package org.dimigo.oop;

public class Count {

    private static int cnt;

    public Count() {

        cnt++;
    }

    public static int getCnt() {

        return cnt;
    }

}
