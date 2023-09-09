package javapackage;

public class ConstructorUsage  {
	
	public ConstructorUsage() {
		System.out.println("default constructor");
	}
	public ConstructorUsage(String hello) {
		System.out.println("parameterized constructor with string :"+hello +" Susha");
	}
	public ConstructorUsage(int a) {
		System.out.println("parameterized constructor with interger "+a);
	}
	public ConstructorUsage(int a,int b,int c,int d) {
		System.out.println("parameterized constructor with intergers "+a +","+b+","+c+","+d);
	}
	public static void main(String[] args) {
		
		ConstructorUsage con=new ConstructorUsage();
		ConstructorUsage con1=new ConstructorUsage("Hello");
		ConstructorUsage con2=new ConstructorUsage(23);
		ConstructorUsage con3=new ConstructorUsage(23,45,56,23);
		
	}

}
