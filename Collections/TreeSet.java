package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets{

	public static void main(String[] args) {
		
		Set<Integer> nums=new TreeSet<>();
		nums.add(21);
		nums.add(4);
		nums.add(16);
		nums.add(8);
		nums.add(41);
		nums.add(62); 
		
		for(int n:nums) {
			System.out.println(n);
		}

	}

}
