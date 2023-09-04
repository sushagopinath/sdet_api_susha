package package1;

public class Student {
	
int age,rollNo;
	
public void display1() {
	System.out.println("Welcome to java class");
}
public void display2() {
	System.out.println("Automation is easy");
}

public static void main(String[] args) {
		
	Student st=new Student();
	st.age=10;
	st.rollNo=2023;
	st.display1();
	st.display2();
	System.out.println("Student age is :"+st.age);
	System.out.println("Student Roll Number is :"+st.rollNo);
	}

}
