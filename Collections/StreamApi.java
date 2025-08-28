package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StreamApi{

	public static void main(String[] args) {
		
//		List<Integer> nums=new ArrayList<>();
		/* List<Integer> nums=Arrays.asList(2,4,5,6);
		int sum=0;
		for(int n:nums) {
			if(n%2==0) {
				n=n*2;
				sum+=n;
			}
		}
		System.out.println(sum);
		System.out.println(nums); */
		List<Integer> nums=Arrays.asList(2,4,5,6);
		
		System.out.println("ForLoop");
		
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		
		System.out.println("ForEachLoop");
		
		for(int n:nums) {
			//First iteration: n = 2 → nums.get(2) = 5 ✅ (by luck, valid index)
            //Next iteration: n = 4 → nums.get(4) ❌ → IndexOutOfBoundsException 
			//(because your list has only 4 elements → max index = 3).
			//System.out.println(nums);*********************************
			
			System.out.println(n);
		}
		
		System.out.println("ForEachMethod");
		
		nums.forEach(n->System.out.println(n));
		
		
		

	}

}
