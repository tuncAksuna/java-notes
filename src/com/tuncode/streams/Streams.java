package com.tuncode.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {

        // Java streams works on Collections. It is made for Collections
        List<Person> people = getPeople();

        // FILTER()
        List<Person> females = people.stream()
                .filter(el -> el.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
        females.forEach(System.out::println);

        // SORT()
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);

        // we can sort reversely : .sorted(Comparator.comparing(Person::getAge).reversed())
        // we can sort with two conditions : .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName)

        // with "limit()" class
        Random random = new Random();
        IntStream sortWithLimit = random.ints().limit(10).sorted();
        sortWithLimit.forEach(System.out::println);

        // ALL MATCH() - everbody/everthing ???
        boolean allMatch = people.stream().allMatch(el -> el.getAge() >= 30);
        System.out.println(allMatch);

        // ANY MATCH() - at least one data condition must meet
        boolean anyMatch = people.stream().anyMatch(el -> el.getAge() <= 20);
        System.out.println(anyMatch);

        // NONE MATCH()
        boolean noneMatch = people.stream().noneMatch(el -> el.getName().equals("Lale"));
        System.out.println(noneMatch);

        // MAX() - returns a OPTIONAL 'cause maybe it won't be able to find given data within collection
        people.stream().max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // MİN()
        people.stream().min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // GROUP()
        Map<Gender, List<Person>> groupByGender = people.stream().collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach(((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        }));

        // EXAMPLE : FIND OLDEST MALE IN THE LIST
        Optional<?> oldestMale = people.stream()
                .filter(el -> el.getGender().equals(Gender.MALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestMale.ifPresent(System.out::println);


    }

    public static List<Person> getPeople() {
        return List.of(
                new Person("Cem Tunç AKSUNA", 20, Gender.MALE),
                new Person("Selvi AKSUNA", 50, Gender.FEMALE),
                new Person("Güvenç AKSUNA", 48, Gender.MALE),
                new Person("Mesut Özil", 47, Gender.MALE)
        );
    }
}
