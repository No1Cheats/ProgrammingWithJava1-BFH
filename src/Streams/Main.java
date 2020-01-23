package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Imperative approach ❌
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

//        females.forEach(System.out::println);

        // Declarative approach ✅

        // Filter ----------------------------------------------------------------------------------------------------//
        List<Person> streamFemales = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

//        females.forEach(System.out::println);

        // Sort ------------------------------------------------------------------------------------------------------//
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge))//.reversed is an option too
                .collect(Collectors.toList());
//        sorted.forEach(System.out::println);

        // All match -------------------------------------------------------------------------------------------------//
        //Is everyone older than 5 years old?
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 5);
//        System.out.println(allMatch);

        // Any match -------------------------------------------------------------------------------------------------//
        // Is at least one person older than 5 years old?
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 5);
//        System.out.println(anyMatch);

        // None match ------------------------------------------------------------------------------------------------//
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));

//        System.out.println(noneMatch);

        // Max -------------------------------------------------------------------------------------------------------//
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // Min -------------------------------------------------------------------------------------------------------//
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // Group -----------------------------------------------------------------------------------------------------//
        //Gives you awesome groupings by a certain trait :)
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });

        // Get the name of the older Female on your List
        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemaleAge.ifPresent(System.out::println);

    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }

}