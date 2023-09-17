package javapackage;

public class Dogs extends Animal{//single inheritance
	
	public void bark() {
		System.out.println("dogs can bark");
	}

	public static void main(String[] args) {
		
		Dogs d=new Dogs();
		d.Walk();
		d.bark();
		d.legs=4;
		System.out.println("Dogs are having "+d.legs+" legs");
	}

}
