package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets{

	public static void main(String[] args) {
		
	 //Stores only unique elements → no duplicates allowed
	 //No indexing → can’t access with get(index)
	 //Order not guaranteed
	 //At most one null allowed
		
		Set<Integer> nums=new HashSet<>();
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(4); //duplicate
		nums.add(6); //duplicate
		for(int n:nums) {
			System.out.println(n);
		}

	}

}
