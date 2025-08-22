package ExceptionHandiling;

public class ExceptionHandilingUsingTryCatch {

	public static void main(String[] args) {
		int i=2;
		int j=0;
		try {
			 j=i/j;
		}
		catch(Exception e) {
			System.out.println("please enter valid number");
		}
		System.out.println(j);
		System.out.println("bye");
	}

}
