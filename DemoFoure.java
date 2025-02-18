import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class DemoFoure {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(4,5,6,7,2,3);

        Stream<Integer> sortedValue= nums.stream()
                       .filter(n->n%2==0)
                       .sorted();

        sortedValue.forEach(n -> System.out.println(n));  
    }
}
