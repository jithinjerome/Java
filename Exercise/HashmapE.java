package b1.Exercise;

import java.util.HashMap;
import java.util.Map;

public class HashmapE {
    public static void main(String[] Args){

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100,"Jithin");
        map.put(101,"Jithu");
        map.put(102,"Dony");
        map.put(103,"Nikhil");
        map.put(104,"Jibbin");

        for (Map.Entry<Integer, String> m: map.entrySet()){
            System.out.println(m.getKey() +":"+m.getValue());
        }

        System.out.println(map.get(100));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
