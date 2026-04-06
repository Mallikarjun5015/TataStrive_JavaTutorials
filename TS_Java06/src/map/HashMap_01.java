package map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_01 {

    public static void main(String[] args) {

        Map<String, Integer> m = new HashMap<>();

        m.put("Gunda", 1);
        m.put("Gundi", 2);
        m.put("Manga", 3);

        Map<String, Integer> hm1 = new HashMap<>();
        Map<String, Integer> hm2 = new HashMap<>();

        hm1.put("Pinda", 1);
        hm1.put("RCB", 2);
        hm1.put("Virat", 3);

        hm2.put("Maka", 1);
        hm2.put("For", 2);
        hm2.put("waste", 3);

        System.out.println("Map m  : " + m);
        System.out.println("Map hm1: " + hm1);
        System.out.println("Map hm2: " + hm2);
    }
}