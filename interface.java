package com.advancedjava;
public class interfaces {

	public static void main(String[] args) {
	developer chakri=new developer();
	computer l=new laptop(); //dynamic method dispatch
	//Parent p = new child();
	//Child child = new Parent();
	computer d=new desktop();
	chakri.dev(l);

	}

}
class developer{
	public void dev(computer d) {//we need to use computer for flexibility
		d.coding();
	}
}
class laptop implements computer{
	public void coding() {
		System.out.println("code complie run");
	}
}
class desktop implements computer{
	public void coding() {
		System.out.println("code complie run faster");
	}
}
interface computer {
	public void coding();
}
