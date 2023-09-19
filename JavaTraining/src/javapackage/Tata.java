package javapackage;

public class Tata extends Vehicle {
	public Tata() {
		this(1,2);
		System.out.println("Child class default constructor");
	}
	public Tata(int a) {
		this(1,2,3);
		System.out.println("Child class one parameterized constructor");
	}
	public Tata(int a,int b) {
		super(1);
		System.out.println("Child class two parameterized constructor");
	}
	public Tata(int a,int b,int c) {
		this();
		System.out.println("Child class three parameterized constructor");
	}
	public static void main(String[] args) {
		Tata tata=new Tata(1);
	}
}
