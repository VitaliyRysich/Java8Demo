package streamsexamples;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        //Imperative approach

        List<Person> females = new ArrayList<>();
        for(Person person: people){
            if(person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }
        System.out.println(females);

        //Declarative approach

        //filter
        System.out.println("--filter--");
        List<Person> females2 = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females2.forEach(System.out::println);


        //sort
        System.out.println("--sort--");
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getGender).thenComparing(Person::getAge))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);


        //All match
        System.out.println("--All match--");

        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge()>8);

        System.out.println(allMatch);


        //Any match
        System.out.println("--Any match--");

        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge()>8);

        System.out.println(anyMatch);


        //None match
        System.out.println("--None match--");

        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getAge()<3);

        System.out.println(noneMatch);


        //Max
        System.out.println("--Max--");

        Optional<Person> max = people.stream()
                .max(Comparator.comparing(Person::getName));

        System.out.println(max);


        //Min
        System.out.println("--Min--");

        Optional<Person> min = people.stream()
                .min(Comparator.comparing(Person::getName));

        min.ifPresent(System.out::println);


        //Group
        System.out.println("--Group--");

        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        });


        //oldestFemaleName
        System.out.println("--oldestFemaleName--");
        Optional<String> oldestFemaleName = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemaleName.ifPresent(System.out::println);

    }

    private static List<Person> getPeople(){
        return Arrays.asList(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
