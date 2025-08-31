package collections;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
     List<String> name=Arrays.asList("navin","abhinov","ntr");
                List<String> UpperCaseNames=name.stream()
                		                      //.map(anotherVariable->anotherVariable.toUpperCase())
                		/*String::toUpperCase means:
                         “Take each element (which is a String) and call its toUpperCase() method.”*/
                		                        .map(String::toUpperCase)
                		   .toList();
      
              //System.out.println(UpperCaseNames);
                UpperCaseNames.forEach(System.out::println);
	}

}
