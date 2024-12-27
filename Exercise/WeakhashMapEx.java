package b1.Exercise;

import java.util.WeakHashMap;

public class WeakhashMapEx {
    public static void main(String[] Args){

        WeakHashMap<String, Integer> number = new WeakHashMap<String, Integer>();
        number.put("One",1);
        number.put("Two",2);
        number.put("Three",3);
        System.out.println(number);

        String four = new String("Four");
        Integer fourValue = 4;

        number.put(four,fourValue);

        System.out.println(number);

        four = null;

        System.gc();
        System.out.println(number);


    }
}
