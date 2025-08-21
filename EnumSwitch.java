package com.advancedjava;

enum Status{
	Running,failed,pending,success;
}

public class EnumSwitch {

	public static void main(String[] args) {
		Status s=Status.Running;
		switch(s) {
		case Running:System.out.println("good");
		break;
		case failed:System.out.println("bad");
		break;
		case pending:System.out.println("check");
		break;
		default:
			System.out.println("very good");

	}}

}
