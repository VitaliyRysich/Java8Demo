package unit1.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("n1", "c4", 11),
                new Person("n2", "c3", 22),
                new Person("n3", "s2", 33),
                new Person("n4", "c6", 44)
        );

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSecondName().compareTo(o2.getSecondName());
            }
        });

        printAll(people);
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getSecondName().startsWith("c");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person person: people){
            if(condition.test(person))
                System.out.println(person);
        }
    }

    private static void printAll(List<Person> people) {
        for(Person person: people){
            System.out.println(person);
        }
    }
}

