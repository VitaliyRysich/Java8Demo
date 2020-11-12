package unit3;

import unit1.exercises.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("n1", "c4", 11),
                new Person("n2", "c3", 22),
                new Person("n3", "s2", 33),
                new Person("n4", "c6", 44)
        );

        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }

        System.out.println("Using for in loop");
        for (Person p : people){
            System.out.println(p);
        }
        System.out.println("Using lambda for each loop");
        //people.forEach(p -> System.out.println(p));
        people.forEach(System.out::println);


    }
}
