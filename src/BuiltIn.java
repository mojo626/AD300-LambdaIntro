import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltIn {
    
    public static void run() {

        Predicate<String> isEmpty = str -> str.isEmpty();

        System.out.println("Testing predicate: ");
        System.out.println(isEmpty.test("hi"));
        System.out.println(isEmpty.test(""));
        System.out.println();

        Function<String, String> upperCase = (str) -> str.toUpperCase();

        System.out.println("Testing Function functional interface: ");
        System.out.println("test -> " + upperCase.apply("test"));
        System.out.println("Hello, World! -> " + upperCase.apply("Hello, World!"));
        System.out.println();
    }
}
