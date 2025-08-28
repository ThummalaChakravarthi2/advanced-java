package collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;

public class Maps{

	public static void main(String[] args) {
   //HashMap is non-synchronized, faster, and allows nulls, while Hashtable is synchronized, slower, and does not allow nulls
		Map<String,Integer> students=new Hashtable<>();
		students.put("navin", 1084);
		students.put("abhi", 2014);
		students.put("ntr", 1046);
		students.put("ben", 1084);
		students.put("navin", 1086); // replaces
		students.put("navin", 1084); // replaces 1086
		
		for(String key:students.keySet()) {
		 System.out.println(key+" : "+students.get(key));
		}

	}

}
