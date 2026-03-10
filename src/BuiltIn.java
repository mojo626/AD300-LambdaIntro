import java.util.function.Predicate;

public class BuiltIn {
    
    public static void run() {

        Predicate<String> isEmpty = str -> str.isEmpty();

        System.out.println("Testing predicate: ");
        System.out.println(isEmpty.test("hi"));
        System.out.println(isEmpty.test(""));
        System.out.println();

        
    }
}
