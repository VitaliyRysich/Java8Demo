package guide.Method_and_Constructor_References;

import guide.Functional_Interfaces.Converter;

public class Main {
    public static void main(String[] args) {

        //static method references
        Converter<String, Integer> converter = Integer::valueOf; //instead of         Converter<String, Integer> converter = (from) ->  Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);   // 123

        //reference of methods via the ::
        Something something = new Something();
        Converter<String, String> converter2 = something::startsWith;
        String converted2 = converter2.convert("Java");
        System.out.println(converted2);    // "J"

        //reference to the Person constructor
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
    }
}
