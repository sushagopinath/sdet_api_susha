package javapackage;

public class LocalGlobalVariables {

int a;	
public void m1() {
	int a=100;
	this.a=10;
	System.out.println("The value of the global varialbe is :"+this.a);
	System.out.println("The value of the local varialbe is :"+a);
	this.m2();
}
public void m2() {
	System.out.println("hello");
}

	public static void main(String[] args) {
		LocalGlobalVariables l=new LocalGlobalVariables();
		l.m1();

	}

}
