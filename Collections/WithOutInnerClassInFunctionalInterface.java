import java.util.function.Predicate;

class EvenPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer n) {
        return n % 2 == 0; // logic for even number
    }
}
import java.util.Arrays;
import java.util.List;

public class FilterPredicate {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,5,6);

        // create object of our Predicate class
        EvenPredicate p = new EvenPredicate();

        int result = nums.stream()
                         .filter(p)               // use the class here
                         .map(n -> n * 2)
                         .reduce(0, (c,e) -> c+e);

        System.out.println(result); // 24
    }
}
