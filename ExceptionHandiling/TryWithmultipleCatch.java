package ExceptionHandiling;

public class ExceptionHandilingUsingTryCatch {

	public static void main(String[] args) {
		int i=0;
		int j=18;
		int a[]=new int[5];
		try {
			j=j/i;
			 System.out.println(a[1]);
			 System.out.println(a[5]);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide it with zero");
		}
		try {
			System.out.println(a[1]);
			 System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter the array Value With In The Range");
		}
		catch(Exception e) {
			System.out.println("please enter valid number"+e);
		}
		System.out.println(j);
		System.out.println("bye");
	}

}
