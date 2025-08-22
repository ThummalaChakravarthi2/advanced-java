package com.advancedjava;

interface Es{
	void display();
// 	void display(int n);
}

public class LamdaExpressions{

	public static void main(String[] args) {
		Es obj=
				new Es(){
		public void display(){
		    System.out.println("In Anonymous class");
		}
		};
				//logic1
		//		 ()-> {
		//	System.out.println("In Anonymous class");
		// }
				//logic2
				//()->System.out.println("In Anonymous class");
				// (int n)->System.out.println("In Anonymous class"); 
		/*}*/
		obj.display();
		}
	}

	