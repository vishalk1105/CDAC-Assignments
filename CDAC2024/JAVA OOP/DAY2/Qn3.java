import java.util.*;

class Qn3{

static public void main(String args[]){
Scanner op = new Scanner(System.in);
System.out.println("Enter number1");
int num1=op.nextInt();
System.out.println("Enter number2");
int num2=op.nextInt();
System.out.println("Enter Operation");
char operation= op.next().charAt(0);

switch (operation){
case '+': System.out.println(num1 +num2);
break;
case '-': System.out.println(num1 - num2);
break;
case '*': System.out.println(num1 * num2);
break;
case '/': System.out.println(num1 / num2);
break;
default: System.out.println("Invalid input");
}

}
}