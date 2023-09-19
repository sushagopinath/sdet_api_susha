package javapackage;
public class ScienceBooks extends Books{
	
	public void defaultMethod() {
		super.oneParameterMethod();
		this.twoParameterMethod();
		System.out.println("child default method");
	}
	public void oneParameterMethod() {
		super.defaultMethod();
		this.defaultMethod();
		System.out.println("child one paramterized method");
	}
	public void twoParameterMethod() {
		
		super.twoParameterMethod();
		System.out.println("child two paramterized method");
		}
	public void threeParameterMethod() {
		super.threeParameterMethod();
		this.oneParameterMethod();
		System.out.println("child three paramterized method");
	}
	public static void main(String[] args) {
		
		ScienceBooks sc=new ScienceBooks();
		sc.threeParameterMethod();
	}
}
