package unit3;

import unit1.exercises.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("n1", "c4", 11),
                new Person("n2", "c3", 22),
                new Person("n3", "s2", 33),
                new Person("n4", "c6", 44)
        );

        System.out.println("Print all");
        performConditionally(people, p -> true, System.out::println); //p -> method(p)
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person person: people){
            if(predicate.test(person))
                consumer.accept(person);
        }
    }

}