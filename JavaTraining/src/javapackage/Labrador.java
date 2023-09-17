package javapackage;

public class Labrador  extends Dogs{ // multilevel inheritance

public void Colour(){
	System.out.println("Labradors are white in colour");
}

	public static void main(String[] args) {
		Labrador l=new Labrador();
		l.legs=4;
		l.bark();
		l.Colour();
		l.Walk();	

	}

}
