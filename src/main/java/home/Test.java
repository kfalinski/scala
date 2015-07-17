package home;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by K on 2015-07-17.
 */
public class Test {

    public static void main(String[] args) {
        OptionalInt result = IntStream.range(0, 1000000)
                .parallel() //1
                .map(e -> e * 2)
                .peek(e -> System.out.println("thread : " + Thread.currentThread().getName())) //2
                .reduce(Integer::sum);

        result.ifPresent(System.out::println);
    }
}
