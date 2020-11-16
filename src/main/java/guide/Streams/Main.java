package guide.Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
//    Collectionlections in Java 8 are extended so you can simply create streams
//    either by calling Collection.stream() or Collection.parallelStream()

    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");



//        Filter
//        Filter accepts a predicate to filter all elements of the stream.
//        This operation is intermediate which enables us to call another stream operation (forEach) on the result.
//        ForEach accepts a consumer to be executed for each element in the filtered stream.
//        ForEach is a terminal operation. It's void, so we cannot call another stream operation.

        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
                // "aaa2", "aaa1"


//        Sorted
//        Sorted is an intermediate operation which returns a sorted view of the stream.
//        The elements are sorted in natural order unless you pass a custom Comparator.

        stringCollection
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
                // "aaa1", "aaa2"

//        Keep in mind that sorted does only create a sorted view of the stream
//        without manipulating the ordering of the backed collection.
//        The ordering of stringCollection is untouched:

        System.out.println(stringCollection);
        // ddd2, aaa2, bbb1, aaa1, bbb3, ccc, bbb2, ddd1


//        Map
//        The intermediate operation map converts each element into another object via the given function.
//        The following example converts each string into an upper-cased string.
//        But you can also use map to transform each object into another type.
//        The generic type of the resulting stream depends on the generic type of the function you pass to map.

        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        // "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"


//        Match
//        Various matching operations can be used to check whether a certain predicate matches the stream.
//        All of those operations are terminal and return a boolean result.

        boolean anyStartsWithA =
                stringCollection
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println(anyStartsWithA);      // true

        boolean allStartsWithA =
                stringCollection
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartsWithA);      // false

        boolean noneStartsWithZ =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithZ);      // true


//        Count
//        Count is a terminal operation returning the number of elements in the stream as a long.

        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();

        System.out.println(startsWithB);    // 3

    }
}
