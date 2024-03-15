import java.util.*;
class Qn3{

public static void main(String args[]){

Scanner sc= new Scanner(System.in);
 double num1= sc.nextDouble();
 long num2= sc.nextLong();
 System.out.println(num1);
 System.out.println(num2);

/*
int result1=(int)num2 + (int)num1;
int result2=(int)num2 - (int)num1;
int result3=(int)num2 * (int)num1;
int result4=(int)  num2 / (int)num1;
int result5=(int)num2 % (int)num1;
System.out.println("Result1   :    "+ result1);
System.out.println("Result2   :    "+ result2);
System.out.println("Result3   :    "+ result3);
System.out.println("Result4   :    "+ result4);
System.out.println("Result5   :    "+ result5);
*/

byte b=45;
char c='a';
short s=1024;
int i=5000;
float f=5.64f;
double d=0.1234;

double result =(f * b)+(i / c) - (d * s);
System.out.println("Result   :    "+ result);


}
}