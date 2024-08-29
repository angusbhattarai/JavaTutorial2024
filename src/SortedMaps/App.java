package SortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer,String>();

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map){

        map.put(1, "Fox");
        map.put(4, "Dog");
        map.put(8, "Lion");
        map.put(2, "Cat");
        map.put(3, "Elephant");
        map.put(7, "Cow");
        map.put(6, "Leopard");
        map.put(5, "Tiger");

        for(Integer key : map.keySet()){
            String value = map.get(key);
            System.out.println(key + ": " + value);

        }
    }
}
