package collections;
import java.util.Map;
import java.util.HashMap;

public class Maps{

	public static void main(String[] args) {
		Map<String,Integer> students=new HashMap<>();
		students.put("navin", 1084);
		students.put("abhi", 2014);
		students.put("ntr", 1046);
		students.put("ben", 1084);
		students.put("navin", 1086); // replaces
		students.put("navin", 1084); // replaces 1086
	
		/* <key,value> key is always unique and pair can be repeated 
		 * So We Have A SET and LIST to get a MAP here
		 */
		
		System.out.println(students);
		//get the value by using key
		System.out.println(students.get("ntr"));
		//to get the keys
		System.out.println(students.keySet());
		
		//key actually holds each key (the String values you used when putting into the map).
		
		for(String key:students.keySet()) {
		 System.out.println(key+" : "+students.get(key));
		}

	}

}
Map
