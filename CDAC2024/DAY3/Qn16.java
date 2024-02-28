import java.io.*;
import java.util.Scanner;

class Qn16{

public static void main(String args[]){

   int num;
   System.out.println("Enter the Number: ");
   Scanner s = new Scanner(System.in);
   num = s.nextInt();
   int prime=0;

for(int i=1;i<=num;i++){
if(num%i==0){
prime++;
}
}

if(prime==2){
System.out.println("The number is prime");
}else System.out.println("The Number is not Prime");
}
}

