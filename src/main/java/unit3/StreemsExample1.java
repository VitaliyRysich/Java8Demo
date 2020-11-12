package unit3;

import unit1.exercises.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreemsExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("n1", "c4", 11),
                new Person("n2", "c3", 22),
                new Person("n3", "s2", 33),
                new Person("n4", "c6", 44)
        );

        people.stream()
                .filter(p -> p.getSecondName().startsWith("c"))
                .forEach(p -> System.out.println(p.getFirstName()));


        long count = people.parallelStream() // or sream
                .filter(p -> p.getSecondName().startsWith("c"))
                .count();
        System.out.println(count);
    }
}
