package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        Condition condition = p -> p.getSecondName().startsWith("s");

        printConditionally(people, condition);
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person person: people){
            if(condition.test(person))
                System.out.println(person);
        }
    }

}


