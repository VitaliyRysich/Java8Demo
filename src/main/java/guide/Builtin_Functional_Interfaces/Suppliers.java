package guide.Builtin_Functional_Interfaces;

import unit1.exercises.Person;

import java.util.function.Function;
import java.util.function.Supplier;

public class Suppliers {
    //Suppliers produce a result of a given generic type.
    // Unlike Functions, Suppliers don't accept arguments.

    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();   // new Person
    }
}
