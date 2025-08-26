//Runnable is a functional Interface
package com.advancedjava;
class za{
	void method() {
		System.out.println("just example");
	}
}

//class chakri extends z implements Runnable{
//	public void run() {
//		for(int i=1;i<=5;i++){
//		System.out.println("hi bro");
//		 try {
//			Thread.sleep(30);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		}
//	}
//}

/*class chakru extends z implements Runnable{
	public void run() {
	for(int i=1;i<=5;i++){
		System.out.println("enti bro");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
}
} */

/*public static void main(String[] args) {
		Runnable obj=new Runnable() {
			public void run() {
				for(int i=1;i<=5;i++){
				System.out.println("hi bro");
				 try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
		};
		
		Runnable obj1=new Runnable() {
			public void run() {
			for(int i=1;i<=5;i++){
				System.out.println("enti bro");
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				}
		}
		};
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();

	

}
}*/
public class ThreadsUsingLamdaExpression {
	public static void main(String[] args) {
		Runnable obj= //new Runnable() {public void run
				() -> {
				for(int i=1;i<=5;i++){
				System.out.println("hi bro");
				 try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
     Runnable obj1= //new Runnable() {public void run
			() -> {
			for(int i=1;i<=5;i++){
				System.out.println("enti bro");
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				}
		
	};
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();	

}
}


