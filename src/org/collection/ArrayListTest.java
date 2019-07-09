package org.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add(2,"사과" );
        list.set( 2,"사광광" );
        list.remove( "딸기" );
        printList(list);
        System.out.println("\n"+list.get( 3 ));
        System.out.println(list.get( 3 ));
        System.out.println(list.get(  list.size()-1  ));
        list.clear();
        printList( list );
    }

    private static void printList(List<String> list) {
        for(String s : list){
            System.out.print(s+" | ");
        }
    }
}
