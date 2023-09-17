package javapackage;
import java.util.Scanner;
public class Arithmetic {
	public int add(int a,int b) {
		int c=a+b;return c;}
	public int sub(int a ,int b) {
		int c=a-b;return c;}
	public int mult(int a ,int b) {
		int c=a*b;return c;}
	public int div(int a ,int b) {
		int c=a/b;return c;}
	public static void main(String[] args) {
	int x1,x2,x3,x4,x5,x6;
	try (Scanner sc1 = new Scanner(System.in)) {
		System.out.print("Enter the value of x1:\t");x1=sc1.nextInt();
		System.out.print("Enter the value of x2:\t");x2=sc1.nextInt();
		System.out.print("Enter the value of x3:\t");x3=sc1.nextInt();
		System.out.print("Enter the value of x4:\t");x4=sc1.nextInt();
		System.out.print("Enter the value of x5:\t");x5=sc1.nextInt();
		System.out.print("Enter the value of x6:\t");x6=sc1.nextInt();}
	System.out.println("The user entered values are x1="+x1+",x2="+x2+",x3="+x3+",x4="+x4+",x5="+x5+"and x6="+x6);
	Arithmetic ar=new Arithmetic();
	int a1=ar.add(x1,x2);
	int a2=ar.add(a1,x3);
	int a3=ar.sub(a2, x4);
	int a4=ar.mult(a3, x5);
	int a5=ar.div(a4, x6); 
	System.out.println("The output of the given expression (((((x1+x2)+x3)-x4)*x5)/x6)using the above values is:"+a5);
	Arithmetic arithmet=new Arithmetic();
	int b1=arithmet.mult(x1,x2);
	int b2=arithmet.sub(b1,x3);
	int b3=arithmet.add(b2, x4);
	int b4=arithmet.sub(b3, x5);
	int b5=arithmet.div(b4, x6); 
	System.out.println("The output of the given expression ((((x1*x2)-x3)+x4)-x5)/x6)using the above values is:"+b5);
	}
}
