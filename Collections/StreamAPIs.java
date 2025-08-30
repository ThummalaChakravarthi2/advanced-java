package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIs {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(2,3,4,5,6);
		
	  /* Stream<Integer> s1=nums.stream();
		 Stream<Integer> s2=s1.filter(n->n%2==0);
		 Stream<Integer> s3=s2.map(n->n*2);
		 int result=s3.reduce(0,(c,e)->(c+e));
		 System.out.println(result); */
		
	  /*  nums.stream()
		    .filter(n->n%2==0)
		    .map(n->n*2)
		    .reduce(0,(c,e)->c+e); */
		
		// you can storge this in integer because reduce give sing
		
       int result=nums.stream()
	                  .filter(n->n%2==0)
	                  .map(n->n*2)
	                  .reduce(0,(c,e)->c+e);
         System.out.println(result);
		    

	}

}
