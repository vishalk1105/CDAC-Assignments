import java.util.Scanner;

public class Student {
private String name;
private int id;
private int marks;

public void acceptRecord() {
	try(Scanner sc = new Scanner(System.in);){
		System.out.print("name :  ");
		name=sc.nextLine();	
		System.out.print("Id :  ");
		id=sc.nextInt();	
		System.out.print("Marks :  ");
		marks=sc.nextInt();
	}	
}

public void displayRecord() {
	System.out.println("Hello my Name is "+this.name+" and my id is "+this.id +" ,I got "+this.marks+" Marks");
}
	
	public static void main(String[] args) {
		Student student= new Student();
		student.acceptRecord();
		student.displayRecord();
	}

}
