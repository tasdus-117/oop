package hus.oop.lab8.maps;
import java.util.*;

public class Maps {
    public static int count (Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        if (!map.containsKey(key)) {
            return false;
        } else {
            if (map.get(key) == value) {
                return true;
            }
        }

        return false;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");

        return map.get(value);
    }
}
