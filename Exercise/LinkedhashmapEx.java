package b1.Exercise;

import java.util.LinkedHashMap;

public class LinkedhashmapEx {
    public static void main(String[] Args){

        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        System.out.println(map);

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<String, Integer>(map);
        numbers.put("Five",5);
        System.out.println(numbers);

        numbers.putIfAbsent("Five",5);
        numbers.putIfAbsent("Six",6);
        System.out.println(numbers);
    }
}
