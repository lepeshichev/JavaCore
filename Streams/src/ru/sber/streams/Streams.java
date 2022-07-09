package ru.sber.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20));
        }
        list.forEach(each -> System.out.print(each + " "));
        System.out.println("\n");
        list.stream().limit(list.size() - 3).forEach(each -> System.out.print(each + " "));
        System.out.println("\n");
        list.stream().filter(each -> each % 2 == 0).map(each -> each + 5).forEach(each -> System.out.print(each + " "));
        System.out.println("\n");
        list.stream().filter(each -> each % 2 != 0).map(each -> each - 5).forEach(each -> System.out.print(each + " "));
        System.out.println("\n");
        OptionalDouble average = list.stream().mapToDouble(a -> a).average();
        System.out.println(average.isPresent() ? average.getAsDouble() : 0);

        Set<String> set = new HashSet<>();
        set.add("asd");
        set.add("asdasdasd");
        set.add("asdasd");
        set.add("asdasdasdasd");
        set.add("asddasdasdasdasdadsasdasd");
        set.add("asdddd");
        set.add("asdasasdasdasd");
        set.add("asdasdasdasdasdasd");
        set.add("asasasdasdasd");
        set.add("asddasdasdad");
        Map<String, String> map = set.stream().filter(each -> each.length() > 10).collect(Collectors.toMap(each -> each, each -> each));
        map.forEach((key, value) -> System.out.println(key + " " + value));

        Map<String, String> newMap = Map.of(
                "a", "bxcvbxcvb",
                "b", "bsdfsdf",
                "c", "xcvbxcvbb",
                "d", "bxcvbxcvb",
                "e", "bxxcvxc"
        );
        List<String> keys = newMap.entrySet().stream().map(Map.Entry::getKey).map(value -> value + " ")
                .collect(Collectors.toList());
        List<String> values = newMap.entrySet().stream().map(Map.Entry::getValue).map(value -> value + " ")
                .collect(Collectors.toList());
        // List<String> newList = newMap.entrySet().stream().map(Map.Entry::getKey).map(value -> value + " ")
        //                                                  .map(Map.Entry::getValue).map(value -> value + " ")
        //                                                  .collect(Collectors.toList());
        List<String> KeysAndValues = new ArrayList<>();
        for (String key : keys) {
            for (String value : values) {
                KeysAndValues.add(key + "== " + value);
                break;
            }
        }
        KeysAndValues.forEach(each -> System.out.print(each + " "));
        System.out.println("\n");
        List<String> KeysAndValues2 = new ArrayList<>();
        for (String key : keys) {
            for (String value : values) {
                KeysAndValues2.add(key);
                KeysAndValues2.add(value);
                break;
            }
        }
        KeysAndValues2.forEach(each -> System.out.print(each + " "));
        Streams streams = new Streams();
        streams.createStream(null);
    }

    public Optional<Streams> createStream(Streams stream) {
        return Optional.ofNullable(stream);
    }
}
