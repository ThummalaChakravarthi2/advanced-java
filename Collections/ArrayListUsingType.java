package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayLists{
	public static void main(String[] args) {
		
	/* Integer is basically a class which is a wrapper class for int type
	 * Integer --> byte,short,int,long
	 * collection normally works with objects not primitive type
	 * if you want to store numbers you need to use Integer
	 */
		
	 //Collection<Integer> nums = new ArrayList<>();
		List<Integer> nums = new ArrayList<>();
		nums.add(2);   // now nums = [2]
		nums.add(4);   // now nums = [2, 4]
		nums.add(3);   // now nums = [2, 4, 3]
		
		//Accessing Index Value Using List
		
		System.out.println(nums.get(2));
		
		// if you have a element you can you can check what is the index value
		System.out.println(nums.indexOf(4));
	}
}

	
/*The for-each loop says:

Take the first element → run the body.

Take the second element → run the body again.

Take the third element → run the body again.

… until no elements left*/
		
//	for(int n:nums) {
//		System.out.println(n);
//	}
//		
// 
//	}
//
//}
