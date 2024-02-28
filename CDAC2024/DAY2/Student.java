class Student {
String name;
int sub1;
int sub2;
int sub3;


void assignMarks(int a, int b, int c){
sub1=a;
sub2=b;
sub3=c;
}

void avgMarks(){
float avg= (sub1 + sub2+ sub3)/3;
System.out.println("Average marks = " +avg);
}

void displayDetails(){
System.out.println("Student name is " + name );
System.out.println("Total marks = " + (sub1+sub2+sub3));
}

public static void main(String args[]){

Student s1= new Student();
s1.name="Vishal";
s1.assignMarks(70,80,40);
s1.avgMarks();
s1.displayDetails();
}
}