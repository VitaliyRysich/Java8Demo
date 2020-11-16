package guide.Builtin_Functional_Interfaces;


import unit1.exercises.Person;

import java.util.function.Consumer;

public class Consumers {

    //Consumers represent operations to be performed on a single input argument.
    public static void main(String[] args) {
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.getFirstName());
        greeter.accept(new Person("Luke", "Skywalker", 12));
    }

}
