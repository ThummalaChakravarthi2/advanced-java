package ExceptionHandiling;

public class ThrowKeyword {

	public static void main(String[] args) {
		/*int i=20;
		int j=18;
		int a[]=new int[5];
		try {
			j=j/i;
			if(j==0) {
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide it with zero");
		}
		catch(Exception e) {
			System.out.println("please enter valid number"+e);
		}
		System.out.println(j);
		System.out.println("bye");*/
		
		int marks = -10;  // JVM says: fine, it's just an int
		try {
		    if (marks < 0) {
		        throw new IllegalArgumentException("Marks cannot be negative");
		         // Without throw, the program would happily print Marks: -10.
		         // With throw, you enforce your own business rule and handle it via catch
		    }
		    System.out.println("Marks: " + marks);
		} catch (IllegalArgumentException e) {
		    System.out.println("Invalid input: " + e.getMessage());
		}

	}

}
