import java.io.*;
import java.util.Scanner;

class Qn18{
public static void main(String args[]){
  int num1, num2;
 int op;
   System.out.println("Enter the First number: ");
   Scanner s = new Scanner(System.in);
   num1 = s.nextInt();

   System.out.println("Enter the Second number: ");
   Scanner s1 = new Scanner(System.in);
   num2 = s1.nextInt();

 System.out.println("Choose an operation");
 System.out.println("1. Addition");
System.out.println("2. Subtract");
System.out.println("3. Multiplication");
System.out.println("4. Division");

  System.out.println("Enter the operation number: ");
   Scanner op1 = new Scanner(System.in);
   op = op1.nextInt();

switch(op){
case 1: System.out.println(num1 + num2);
break;

case 2: System.out.println(num1 - num2);
break;

case 3: System.out.println(num1 * num2);
break;

case 4: System.out.println(num1 / num2);
break;

default: System.out.println("Invalid Input");

}





}
}