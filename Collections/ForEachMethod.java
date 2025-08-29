package collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachMethod {

	public static void main(String[] args) {
		
     /* List<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		Here, you are creating a brand new ArrayList object
		Values are stored in that list one by one using add
		It is fully dynamic → you can add, remove, set, etc  */
		
		 List<Integer> nums=Arrays.asList(2,3,4,5);
		
		/*Here, you are NOT creating a normal ArrayList
		 * Instead, Arrays.asList returns a special fixed-size list (internally backed by an array).

          That’s why:

           ✅ You can change values with set:

            nums.set(0, 99); // works
            
            ❌ But you cannot change the size:

            nums.add(6); // throws UnsupportedOperationException
            
            nums.remove(1); // also throws


          👉 Technically:

           new ArrayList<>() → a normal resizable ArrayList.

           Arrays.asList(...) → a fixed-size list view of an array.

         📌 That’s why your syntax looks different:

           When you see new ArrayList<>(), you are explicitly creating a list.

           When you see Arrays.asList(...), Java is wrapping values into a pre-built list (shortcut way) */
		 
		     //Before Lamda Expression
		 
//		   Consumer<Integer> com=new Consumer<>() {
//
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//			   
//		   };
//		  nums.forEach(com);
//
//	}
		 // LAMDA EXPRESSION
		   //Consumer<Integer> com=(Integer t)->System.out.println(t);
		   /*Consumer<Integer> com=t->System.out.println(t);

		   nums.forEach(com);*/
		   
		   // instead of this you can directly write this
		   
          nums.forEach(t->System.out.println(t));
		}

}

