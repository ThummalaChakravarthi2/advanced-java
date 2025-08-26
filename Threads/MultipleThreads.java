package com.advancedjava;


class Aaa extends Thread{
	public void run() {
		for(int i=1;i<=100;i++){
		System.out.println("hi");
		}
	}
}

class Baa extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("hello");
		}
	}
}

public class threads{
 public static void main(String[] args) {
	 Aaa obj=new Aaa();
	 Baa obj1=new Baa();
	 obj.start();
	 obj1.start();
	 
 }
}

