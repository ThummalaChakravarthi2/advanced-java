package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterPredicate {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(2,3,4,5,6);
		// Function<Integer,Integer> fun=t-> t*2;
				
				
	   int result=nums.stream()
	                  .filter(n->n%2==0)
	                  .map(t-> t*2)
	                  .reduce(0,(c,e)->c+e);
         System.out.println(result);
		    

	}

}
