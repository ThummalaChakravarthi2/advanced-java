package com.advancedjava;

enum Status{
	Running,failed,pending,success;
}

public class EnumSwitch {

	public static void main(String[] args) {
		Status s=Status.Running;
		if(s==Status.Running) {
			System.out.println("good");
		}
		else if(s==Status.failed) {
			System.out.println("bad");
		}
		else if(s==Status.pending) {
			System.out.println("check");
		}
		else {
			System.out.println("very good");
		}

	}

}
