package package1;

public class Table {
	
public void multiply(int a) {
	for(int i=1;i<=10;i++) {
		System.out.println(a+"*"+i+"="+(a*i));
	}
}

	public static void main(String[] args) {
		Table t=new Table();
		t.multiply(5);
	}

}
