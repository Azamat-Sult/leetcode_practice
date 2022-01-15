package streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiUsage {

    public static void main(String[] args) {

        //Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(num -> num > 5).forEach(System.out::println);

        //Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).skip(3).forEach(System.out::println);

        //Stream.of(1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10).distinct().forEach(System.out::println);

        //Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).map(num -> num + 1).forEach(System.out::println);

        /*Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());*/

        //Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).limit(4).forEach(System.out::println);

        //Stream.of('d', 'c', 'b', 'a').sorted().forEach(System.out::println);

        //Stream.of('a', 'b', 'c', 'd').sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //Stream.of("1", "2", "3", "4").mapToInt(Integer::parseInt).forEach(System.out::println);

        //Stream.of("one", "two", "three", "four").mapToInt(String::length).forEach(System.out::println);

        /*Stream.of(new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}})
                .flatMap(Arrays::stream)
                .forEach(System.out::println);*/

        /*List<String> list1 = List.of("1", "2", "3", "4");
        List<String> list2 = List.of("5", "6", "7", "8");
        List<String> list3 = List.of("9", "10", "11", "12");
        List<List<String>> list = List.of(list1, list2, list3);

        list.stream().flatMap(Collection::stream).forEach(System.out::println);*/

        //System.out.println(Stream.of("1", "2", "3", "4").findFirst());

        //System.out.println(Stream.of("1", "2", "3", "4").findAny());

        /*List<Integer> result = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6})
                .boxed()
                .collect(Collectors.toList());
        System.out.println(result);*/

        /*Set<Integer> result = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6})
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(result);*/

        /*Map<Integer, Integer> result = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6})
                .boxed()
                .collect(Collectors.toMap(num -> num, num -> num * num));
        System.out.println(result);*/

        //System.out.println(Stream.of("1", "2", "3", "4").count());

        //System.out.println(Stream.of("1", "2", "3", "4").anyMatch(str -> (str.equals("3"))));

        //System.out.println(Stream.of("1", "2", "3", "4").noneMatch((str -> (str.equals("10")))));

        //System.out.println(Stream.of("1", "2", "3", "4", "").allMatch((str -> (!str.equals("")))));

        //System.out.println(Stream.of(1, 2, 3, 4, 5, -6, 7, 8, 9, 10).min(Integer::compareTo));

        //System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 100).max(Integer::compareTo));

        /*List<Integer> results = new ArrayList<>();
        IntStream.range(0, 10)
                .forEach(results::add);
        System.out.println(results);*/

        /*List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        list.stream().parallel().forEach(System.out::println);
        System.out.println();
        list.stream().parallel().forEachOrdered(System.out::println);*/

        /*List<String> list1 = new ArrayList<>();
        list1.add("d");
        list1.add("c");
        list1.add("b");
        list1.add("a");
        String[] result = list1.stream().map(String::toUpperCase).toArray(String[]::new);
        System.out.println(Arrays.toString(result));*/

        System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .reduce(100, (n1, n2) -> (n1 + n2)));

    }

}