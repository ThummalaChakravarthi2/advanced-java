package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterPredicate {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(2,3,4,5,6);
		
		Predicate<Integer> p=new Predicate<>() {

			@Override
			public boolean test(Integer n) {
				if(n%2==0)
					return true;
				else
				    return false;
			}
			
		};
	   int result=nums.stream()
	                  .filter(p)
	                  .map(n->n*2)
	                  .reduce(0,(c,e)->c+e);
         System.out.println(result);
		    

	}

}
