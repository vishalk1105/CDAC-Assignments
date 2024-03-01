package package1;
import package2.Student;
class StudentDemo {
public static void main(String args[]){

Student obj = new Student();
Student obj1 = new Student(1,22,75.0f);

//System.out.println("Student details :"  );
//obj.studentDetails();
//obj1.studentDetails();

System.out.println("Student ID:" + obj.rollNo );
System.out.println("Student ID:" + obj1.rollNo );
//obj.showRollNo();
//obj1.showRollNo();


}

}
