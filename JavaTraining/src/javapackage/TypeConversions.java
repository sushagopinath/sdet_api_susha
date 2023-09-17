package javapackage;

public class TypeConversions {

	public static void main(String[] args) {
		int a=10;
		float f=a;//implicit conversion
		System.out.println("Int value "+a+" is converted to float "+f);
		float b=12.334545F;
		int i=(int)b;//explicit conversion
		System.out.println("Float value "+b+" is converted to int "+i);
		
		

	}

}
