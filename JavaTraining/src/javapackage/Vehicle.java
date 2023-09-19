package javapackage;

public class Vehicle {
	public Vehicle() {
		this(1,2,3);
		System.out.println("Parent default constructor");
	}
	public Vehicle(int a ) {
		this(1,2);
		System.out.println("Parent one parameterized constructor");
	}
	public Vehicle(int a,int b ) {
		this();
		System.out.println("Parent two parameterized constructor");
	}
	public Vehicle(int a,int b,int c ) {
		System.out.println("Parent three parameterized constructor");
	}
	public static void main(String[] args) {
		
	}

}
