package com.tuncode.streams;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practices {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Cem Tunç", "", "Aksuna", "Tuncode", "Redis Sentinel", "Elasic Search", "CouchbaseDB");

        stringList.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(12, 1, 32, 1552);

        // ********************************************************************************************************* //

        /*
         * converting to IntStream for getting average of integerList values and better performance
         */
        double intStreamForBetterPerformance = integerList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        /*
         * converting to IntStream for getting average of integerList and better performance.
         * finally, boxed method used to return in List type again.
         */
        List<Double> boxedList = integerList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .stream()
                .boxed()
                .collect(Collectors.toList());

        int[] myIntArray = new int[1_000_000];

        long startedTime = System.currentTimeMillis();
        System.out.println("Started Time: " + startedTime);
        IntStream.of(myIntArray)
                .boxed()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Ended Time: " + System.currentTimeMillis());
        System.out.println("Total Time : " + (System.currentTimeMillis() - startedTime));

        long startedTime1 = System.currentTimeMillis();
        System.out.println("Total Time : ( NOT USED BOXED ): " + startedTime1);
        List<Integer> collect = IntStream.of(myIntArray)
                .filter(i -> i % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Ended time: " + System.currentTimeMillis());
        System.out.println("Total Time : " + (System.currentTimeMillis() - startedTime1));


        // ********************************************************************************************************* //

        // find second-biggest value in Integer List:
        integerList.stream()
                .sorted()
                .skip(1)
                .forEach(System.out::println);

        //  find second-biggest value in Integer List when % 2 == 0 and sorted:
        integerList.stream()
                .filter(value -> value % 2 == 0)
                .sorted()
                .skip(1)
                .forEach(System.out::println);

        List<BigDecimal> bigDecimalList = new ArrayList<>();
        bigDecimalList.add(BigDecimal.valueOf(32));
        bigDecimalList.add(BigDecimal.valueOf(152));
        bigDecimalList.add(BigDecimal.valueOf(12));
        bigDecimalList.add(BigDecimal.valueOf(1000));

        bigDecimalList.stream()
                .filter(Objects::nonNull)
                .distinct()
                .map(BigDecimal::abs)
                .sorted()
                .forEach(System.out::println);

        bigDecimalList.parallelStream()
                .filter(Objects::nonNull)
                .reduce(BigDecimal.ZERO, BigDecimal::add, BigDecimal::add);


        // groupingBy and average salary
        List<Person> personList = List.of(
                new Person("Test", 15, Gender.MALE, 1000.00),
                new Person("Cem Tunç", 15, Gender.FEMALE, 120.00),
                new Person("AKSUNA", 15, Gender.FEMALE, 12331.00),
                new Person("Selvi Aksuna", 15, Gender.MALE, 1001.00)
        );

        Map<Gender, Double> averageSalaryByGrouping = personList.stream()
                .collect(
                        Collectors.groupingBy(
                                Person::getGender,
                                Collectors.averagingDouble(Person::getSalary)
                        )
                );

        averageSalaryByGrouping.entrySet().forEach(System.out::println);

        // get min salary in Person List
        Double personMinSalaries = personList.stream()
                .map(Person::getSalary)
                .filter(Objects::nonNull)
                .reduce(0.00, Double::min);

        personList.stream()
                .filter(Objects::nonNull)
                .collect(
                        Collectors
                                .groupingBy(
                                        Person::getGender,
                                        Collectors.averagingDouble(Person::getSalary)
                                )
                );
    }

}
