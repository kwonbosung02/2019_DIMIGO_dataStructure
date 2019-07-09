package org.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap<>( );
        Map <String, List<String>> map1 = new HashMap<>(  );
        List<String> list = new ArrayList<>(  );

        List<Map<String,String>> list1 = new ArrayList<>(  );
        Map<String,String> map2 = new HashMap<>(  );
        map2.put("댄스","노래1");
        map2.put("댄스2","노래2");
        list1.add(map2);



        list.add("노래 1");
        list.add("노래 2");
        list.add("노래 3");
        map1.put("댄스",list);

        map.put ("kor",100);
        map.put( "mat",99);
        map.put( "eng",9008);
        map.put( "eng",80 );
        map.remove( "eng" );
        map.clear();
        printMap(map);
    }

    private static void printMap(Map<String, Integer> map) {
        for(String key : map.keySet()){
            System.out.print(key + " : " + map.get( key ) + "  \n");
        }
    }


}
