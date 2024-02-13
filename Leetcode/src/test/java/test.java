import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> result = list
                .stream()
                .reduce(2, (a, b) -> a * b, (c, d) -> c + d)
                .describeConstable();
        System.out.println(result);
    }
}
