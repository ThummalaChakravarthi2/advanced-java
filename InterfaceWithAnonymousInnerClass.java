package com.advancedjava;
interface C{
	void display();
}
//class Ab implements C{
//	public void display() {
//		System.out.println("Interfaces need to be Implemented");
//	}
//}

public class InterfaceWithAnonymousInnerClass {

	public static void main(String[] args) {
		C obj=new C() {;
		public void display() {
			System.out.println("In Anonymous class");
		}
		};
		obj.display();

	}

}
