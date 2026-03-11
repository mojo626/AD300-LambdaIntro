import java.util.function.Function;

interface StringOperation {

    String apply(String s1, String s2);
}

public class Advanced {
    
    public static void run() {

        Function<Integer, Integer> addOne = (a) -> a + 1;
        Function<Integer, Integer> multiplyByTen = (a) -> a * 10;

        System.out.println("Testing composition: ");
        System.out.println("1 -> " + addOne.andThen(multiplyByTen).apply(1));
        System.out.println();

        StringOperation concat = (s1, s2) -> s1.concat(s2);
        StringOperation longerString = (s1, s2) -> s1.length() > s2.length() ? s1 : s2;

        System.out.println("Testing functional interface: ");
        System.out.println(concat.apply("Hello, ", "World!"));
        System.out.println(longerString.apply("Testing", "Testing2"));
    }
}
