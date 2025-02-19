import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRef{
    public static void main(String[] args){
        List<String> names=Arrays.asList("navin","kumara","saman","anuradha");

        List<String> uNames= names.stream()
                    .map(String::toUpperCase)                //Method reference
                    .collect(Collectors.toList());

        uNames.forEach(System.out::println);
    }
}