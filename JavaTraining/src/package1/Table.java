package package1;

import java.util.Scanner;

public class Table {
	
public void multiply(int a) {
	for(int i=1;i<=10;i++) {
		System.out.println(a+"*"+i+"="+(a*i));
	}
}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number: ");
			int a =sc.nextInt();
			Table t=new Table();
			t.multiply(a);
		}
	}
}
