import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by watsonarw on 14/04/15.
 */
public class Introductory {
    public static void main(String[] args) {
        Triangle.easiestExcersieEver();
        Triangle.horizontalLine(8);
        Triangle.verticalLine(3);
        Triangle.rightTriangle(3);
        Diamond.isoscelesTriangle(3);
        Diamond.diamond(3);
        Diamond.diamondWithName(3);
        fizzBuzz();
        System.out.println(generate(30));
    }

    private static void fizzBuzz() {
        StringBuilder sb = new StringBuilder();
        IntStream.rangeClosed(1, 100)
                .forEachOrdered(i -> {
                    boolean flag = false;
                    if (i % 3 == 0) {
                        sb.append("Fizz");
                        flag = true;
                    }
                    if (i % 5 == 0) {
                        sb.append("Buzz");
                        flag = true;
                    }
                    if (!flag) {
                        sb.append(i);
                    }
                    sb.append("\n");
                });
        System.out.println(sb.toString());
    }

    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = IntStream.rangeClosed(2, n)
                 .parallel()
                 .filter(i -> n % i == 0)
                 .filter(i -> isPrime(i))
                 .sorted()
                 .boxed()
                 .collect(Collectors.toList());
        return primeFactors;
    }

    private static boolean isPrime(int n) {
        return IntStream.range(2,n)
                 .parallel()
                 .filter(i -> n % i == 0)
                 .toArray().length == 0;
    }
}