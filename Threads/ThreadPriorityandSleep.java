package com.advancedjava;
class a extends Thread{
	public void run(){
		for(int i=0;i<=20;i++){
	System.out.println("hi");
	try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		}
	}
}
class b extends Thread{
	public void run() {
	 for(int i=0;i<=20;i++) {
	System.out.println("hello");
	try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 }
	}
	
}

public class ThreadPriorityandSleep {

	public static void main(String[] args) {
		a obj=new a();
		b obj1=new b();
		obj.setPriority(Thread.MAX_PRIORITY);
		System.out.println(obj.getPriority());
		obj.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	obj1.start();

	}

}
