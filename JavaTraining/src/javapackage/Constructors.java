package javapackage;
public class Constructors {
	
public Constructors() {
		this(1,2,3,5);
		System.out.println("This is the deault constructor");
}
public Constructors(int a) {
	this();
	System.out.println("This is the constructor with one parameter");
}
public Constructors(int a,int b) {
	this(1,2,3);
	System.out.println("This is the constructor with two parameters");
}
public Constructors(int a,int b,int c) {
	
	System.out.println("This is the constructor with three parameters");
}
public Constructors(int a,int b,int c,int d) {
	this(1,2);
	System.out.println("This is the constructor with four parameters");
}
	public static void main(String[] args) {
		Constructors c=new Constructors(1);
	}

}
