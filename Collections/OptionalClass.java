package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalClass {

	public static void main(String[] args) {
		List<String> str= Arrays.asList("navin","laxmi","abhinov","tiger");
		
		// it creates null pointer exception so we are using optinal class
		
	   /*String s=str.stream()
				     .filter(str->str.contains("x"))
				     .findFirst() */
		Optional<String> s=str.stream()
			                  .filter(n->n.contains("x"))
			                  .findFirst();
		// if there is no x it will throw NullPointerException but we are using OptionalClass
		
		System.out.println(s.get());
		
		/* if there is no x it will throw error*/
		
		System.out.println(s.orElse("Not Found"));
		
		//if there is no x it will return not found instead of error
				    
		
	
	}
}
