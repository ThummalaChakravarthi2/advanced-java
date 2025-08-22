package ExceptionHandiling;
class ChakriException extends Exception{
	public ChakriException(String messsage) {
		super(messsage);
	}
}

public class CustomException {

	public static void main(String[] args) {
		int i=20;
		int j=0;
		try {
			j=18/i;
			if(j==0) {
				throw new ChakriException("This is my own error");
			}
			
		}
		catch(ChakriException e) {
			j=18/1;	
			System.out.println("In chakri Exception"+e);
			}
		catch(Exception e) {
			System.out.println("SomeThing Went Wrong");
		}
				

	}

}
