package lab8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {
    public static Stream<String> callInCount(String line){
        System.out.println(line);
        return Stream.of(line.split(" "));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("We are here", "Try again"));
        long count = list
                .stream()
                .flatMap(
                        StreamsExample::callInCount
                ).count();
        System.out.println("count= " + count);
    }
}