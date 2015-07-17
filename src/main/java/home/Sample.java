package home;

import scala.Int;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

/**
 * Created by K on 2015-07-04.
 */
public class Sample {

    public static void main(String[] args) {

        doing(1, 888, (a, b) -> a + b);
        Complex complex = new Complex(1.2, 2.2);
        System.out.println(complex.im() + " " + complex.re());
        doing(1, 2, (a, b) -> a + b);
    }

    private static void doing(int a, int b, IntBinaryOperator operator) {
        System.out.println(IntStream.range(a, b)
                .reduce(operator)
                .getAsInt());
        String x = "";
        x.isEmpty();

        IntStream.rangeClosed(0, 100).forEach(System.out::println);

    }


}


class Run implements Runnable {

    AtomicInteger atomicInteger = new AtomicInteger(1);

    public Run() {
        atomicInteger.incrementAndGet();
    }

    @Override
    public void run() {
        System.out.println("");
    }
}
