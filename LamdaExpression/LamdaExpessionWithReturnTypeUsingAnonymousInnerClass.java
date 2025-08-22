package com.advancedjava;
/*interface Aa{
	int add(int a,int b);
}

public class LamdaExpessionWithReturnTypeUsingAnonymousInnerClass {

	public static void main(String[] args) {
		Aa obj=new Aa() {
			public int add(int a,int b) {
				return a+b;
			}
		};
		int sum=obj.add(2,2);
		System.out.println(sum);

	}

}*/
@FunctionalInterface
interface Aa{
	int add(int a,int b);
}

public class LamdaExpessionWithReturnTypeUsingAnonymousInnerClass {

	public static void main(String[] args) {
		Aa obj=(a,b) -> a+b;
			
		int sum=obj.add(2,2);
		System.out.println(sum);

	}

}
