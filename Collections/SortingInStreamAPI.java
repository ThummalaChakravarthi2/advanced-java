package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
 
public class FilterPredicate {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
 
        // Stream operations: filter even numbers and sort them
        Stream sortedValues = nums.stream()
                                  .filter(n -> n % 2 == 0)
                                  .sorted();
 
        // Print the sorted even numbers
        sortedValues.forEach(n -> System.out.println(n));
    }
}
 

