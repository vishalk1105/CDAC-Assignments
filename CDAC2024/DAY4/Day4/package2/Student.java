package package2;

public class Student{
protected int rollNo;
private int age;
private float marks;

public Student(){
	rollNo = 0;
	age = 21;
	marks = 0.0f;
}

public Student(int rollNo, int age, float marks){
	this.rollNo = rollNo;
	this.age = age;
	this.marks = marks;
}

	protected void studentDetails(){
		System.out.println(rollNo +" " +age+ " " +marks);
	}
	void showRollNo(){
		System.out.println(rollNo);
	}

}