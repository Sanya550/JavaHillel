package HW29;

import HW29.entity.User;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //1:
        Stream<Object> empty = Stream.empty();
        empty.skip(1)
                .distinct()
                .findFirst();
        //2:
        List<String> secondList = Arrays.asList("first ", "second ", "third");
        Stream<String> secondStream = secondList.stream();
        List<String> collection = secondStream.filter(val -> val.length() > 4)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(collection);

        //3:
        Stream<String> thirdStream = Stream.of("first ", "second ", "third ");
        List<String> thirdList = thirdStream.collect(Collectors.toList());
        thirdList.forEach(System.out::print);


        System.out.println();
        //4:
        HashMap<Integer, String> fourthMap = new HashMap<>();
        fourthMap.put(1, " Real ");
        fourthMap.put(2, " Barcelona ");
        fourthMap.put(3, " Dynamo ");
        fourthMap.put(4, "Chelsea");
        Stream fourStreamKey = fourthMap.keySet().stream();
        Stream fourStreamValue = fourthMap.values().stream();
        fourStreamKey.forEach(System.out::print);
        fourStreamValue.forEach(System.out::print);

        System.out.println();
        //5:
        ArrayList<String> fiveList = new ArrayList();
        fiveList.add("1");
        fiveList.add("2");
        fiveList.add("3");
        fiveList.add("4");
        fiveList.add("5");
        fiveList.add("6");
        fiveList.add("7");
        fiveList.add("8");
        fiveList.add("9");
        fiveList.add("10");
        Stream<String> fiveStream = fiveList.stream();
        Set fiveSet = fiveStream.skip(1)
                .limit(8)
                .map(val -> Integer.parseInt(val))
                .filter(val -> val % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(fiveSet);

        //6:
        Stream<String> sixStream = Stream.of("one", "two", "three", "four");
        Stream<String> sixParallelStream = sixStream.parallel();
        Optional<String> first = sixParallelStream.sorted()
                .filter(val -> val.length() > 3)
                .findFirst();
        System.out.println(first);

        //7:
        Random random = new Random(System.currentTimeMillis());
        Arrays.stream(("The lion is a species in the family Felidae and a member of the genus Panthera. It has a muscular, deep-chested body, short, rounded head, round ears, and a hairy tuft at the end of its tail")
                .split("[., ]"))
                .filter(s -> !s.isEmpty())
                .map(String::length)
                .map(random::nextInt)
                .distinct()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(System.out::println);
//7:
//        Stream<Integer> sevenStream = Stream.of(1,2,3);
//        sevenStream.filter(s -> {
//            if (s >= 2) {
//                return true;
//            }
//            return false;
//        }).map(s -> {
//            System.out.println("map: " + s);
//            return s.doubleValue();
//        }).forEach(s-> System.out.println("for each: "));
    }
}
