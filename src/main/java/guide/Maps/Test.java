package guide.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < 10; i++){
            map.putIfAbsent(i+1, new Random().nextInt(100));
        }

        map.values().stream().forEach(System.out::println);

        map.values()
                .stream()
                .min((o1, o2) -> o1.compareTo(o2))
                .ifPresent(System.out::println);

        map.entrySet().stream()
                .forEach(System.out::println);

        map.entrySet().stream()
                .sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                .forEach(System.out::println);
    }
}
