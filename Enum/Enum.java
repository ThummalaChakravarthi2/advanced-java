enum Status {
  running,failed,pending,success;
}
public class Enum{
	public static void main(String[] args) {
		Status[] s=Status.values();
		for(Status variable : s) {
			System.out.println(variable+" :"+ variable.ordinal());
		}
	}
}
