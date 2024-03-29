package com.tuncode.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        // STREAMS CANNOT BE REUSED.

        // WITH OBJECT ( PERSON )  ******************************************************************************

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

        // ALL MATCH() - everbody/everything ???
        boolean allMatch = people.stream()
                .allMatch(el -> el.getAge() >= 30);
        System.out.println(allMatch);

        // ANY MATCH() - at least one data condition must meet
        boolean anyMatch = people.stream()
                .anyMatch(el -> el.getAge() <= 20);
        System.out.println(anyMatch);

        // NONE MATCH()
        boolean noneMatch = people.stream()
                .noneMatch(el -> el.getName().equals("Lale"));
        System.out.println(noneMatch);

        // MAX() - returns a OPTIONAL 'cause maybe it won't be able to find given data within collection
        people.stream().max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // MİN()
        people.stream().min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // GROUP()
        Map<Gender, List<Person>> groupByGender = people
                .stream()
                .collect(Collectors.groupingBy(Person::getGender));

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

        // ****************************************** OTHER EXAMPLES  ********************************************* //

        List<Integer> arrList = Arrays.asList(10, 100, 20, 200);

        List<Integer> arrListFiltered = arrList.stream()
                .map(el -> el * 10 / 2)
                .collect(Collectors.toList());
        arrListFiltered.forEach(System.out::println);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl", "");
        List<String> countedString = strings.stream()
                .filter(el -> el.isEmpty())
                .map(el -> el.replace("", "A"))
                .collect(Collectors.toList());
        System.out.println("Filtered and Mapped : " + countedString);

        List<String> mappedFilteredSortedString = strings.stream()
                .filter(el -> el.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        mappedFilteredSortedString.forEach(System.out::println);

        List<String> findFirst = strings.stream()
                .findFirst()
                .stream()
                .collect(Collectors.toList());
        System.out.println(findFirst);

        strings.stream()
                .filter(el -> el.contains("c"))
                .map(String::toUpperCase)
                .limit(2)
                .forEach((el) -> System.out.format("Data %s \n", el));


        List<Integer> integerList = Arrays.asList(10, 20, 40, 1, 212, 51);
        List<Integer> filterAndMap = integerList.stream()
                .filter(el -> el > 10)
                .map(elm -> (elm * 2) / 3)
                .collect(Collectors.toList());
        System.out.println("Filter and map : " + filterAndMap);

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
