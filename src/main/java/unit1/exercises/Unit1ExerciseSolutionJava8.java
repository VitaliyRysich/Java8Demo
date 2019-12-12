package unit1.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("n1", "c4", 11),
                new Person("n2", "c3", 22),
                new Person("n3", "s2", 33),
                new Person("n4", "c6", 44)
        );

        System.out.println("Collection sort");
        Collections.sort(people, (o1, o2) -> o1.getSecondName().compareTo(o2.getSecondName()));

        System.out.println("Print all");
        printConditionally(people, p -> true);
        System.out.println("Print Conditionally");

        printConditionally(people, p -> p.getSecondName().startsWith("s"));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> condition) {
        for(Person person: people){
            if(condition.test(person))
                System.out.println(person);
        }
    }

}


