import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ListOperations {
    
    public static void run() {

        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("red", "blue", "green", "orange", "yellow", "purple"));

        stringList.sort((String a, String b) -> a.compareTo(b));

        System.out.println("Sorted list of strings: ");
        for (String str : stringList) {
            System.out.println(str);
        }
        System.out.println();


        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        integerList = new ArrayList<>(integerList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList()));

        System.out.println("Filtered list of integers: ");
        for (int num : integerList) {
            System.out.println(num);
        }
        System.out.println();
    }
}
