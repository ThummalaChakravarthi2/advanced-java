package com.advancedjava;/* 

class A{
public void ShowTheDataWhichBelongsToThisClass() {
	    System.out.println("In A show");
}
}
class B extends A{
	public void ShowTheDataWhichBelongToThisClass() {//class name wrong which leads to bug
	    System.out.println("In B show");
}
}

public class Override {

	public static void main(String[] args) {
		B obj=new B();
		obj.ShowTheDataWhichBelongToThisClass();

	}

} */
// to overcome this we use @Override Annotation


class A {
    public void ShowTheDataWhichBelongsToThisClass() {
        System.out.println("In A show");
    }
}

class B extends A {
    @Override
    public void ShowTheDataWhichBelongsToThisClass() {
        System.out.println("In B show");
    }
}

public class Overrides{
    public static void main(String[] args) {
        B obj = new B();
        obj.ShowTheDataWhichBelongsToThisClass();
    }
}
