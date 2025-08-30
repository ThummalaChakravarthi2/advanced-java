package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterPredicate {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(2,3,4,5,6);
//		
//		Predicate<Integer> p=new Predicate<>() {
//
//			@Override
//			public boolean test(Integer n) {
//				if(n%2==0)
//					return true;
//				else
//				    return false;
//			}
//			
//		};
		
	/*	Predicate<Integer> p=new Predicate<>() {
			
			// you can directly return n%2==0;
			@Override
			public boolean test(Integer n) {
				return n%2==0;
			}
			
		}; */
		
		//lamda expression
		
		//p is = n->n%2==0 so you can directly write this in filter
		
	    //Predicate<Integer> p=n->n%2==0;
			
	
	   int result=nums.stream()
	                  .filter(n->n%2==0)
	                  .map(n->n*2)
	                  .reduce(0,(c,e)->c+e);
         System.out.println(result);
		    

	}

}
