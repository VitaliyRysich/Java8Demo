package guide.Maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        As already mentioned maps do not directly support streams.
//        There's no stream() method available on the Map interface itself,
//        however you can create specialized streams upon the keys,
//        values or entries of a map via map.keySet().stream(), map.values().stream() and map.entrySet().stream().
//
//        Furthermore maps support various new and useful methods for doing common tasks.

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((id, val) -> System.out.println(id + ": " + val));

//        This example shows how to compute code on the map by utilizing functions:

        map.computeIfPresent(3, (num, val) -> val + num);
        map.get(3);             // val33

        map.computeIfPresent(9, (num, val) -> null);
        map.containsKey(9);     // false

        map.computeIfAbsent(23, num -> "val" + num);
        map.containsKey(23);    // true

        map.computeIfAbsent(3, num -> "bam");
        map.get(3);             // val33


//        Next, we learn how to remove entries for a given key, only if it's currently mapped to a given value:

        map.remove(3, "val3");
        map.get(3);             // val33

        map.remove(3, "val33");
        map.get(3);             // null


//        Another helpful method:

        map.getOrDefault(42, "not found");  // not found


//        Merging entries of a map is quite easy:

        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        map.get(9);             // val9

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        map.get(9);             // val9concat
//        Merge either put the key/value into the map if no entry for the key exists, or the merging function will be called to change the existing value.


    }
}
