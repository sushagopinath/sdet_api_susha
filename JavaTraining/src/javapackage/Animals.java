package javapackage;

public class Animals {//has as relation
	
	public void run(){
		System.out.println("Animals can run");
	}

	public static void main(String[] args) {
		Animal a=new Animal();
		a.Walk();
		Animals a1=new Animals();
		a1.run();
		

	}

}
