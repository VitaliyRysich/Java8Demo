package guide.Builtin_Functional_Interfaces;

import unit1.exercises.Person;

import java.util.Comparator;

public class Comparators {
    //Comparators are well known from older versions of Java.
    // Java 8 adds various default methods to the interface.
    public static void main(String[] args) {
        Comparator<Person> comparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getSecondName());

        Person p1 = new Person("John", "Doe", 12);
        Person p2 = new Person("Alice", "Wonderland",12);

        comparator.compare(p1, p2);             // > 0
        comparator.reversed().compare(p1, p2);  // < 0
    }
}
