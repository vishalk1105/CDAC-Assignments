import java.io.*;
import java.util.Scanner;
class Qn15{

public static void main(String args[]){

   int num;
   System.out.println("Enter the Number: ");
   Scanner s = new Scanner(System.in);
   num = s.nextInt();
int sum=0;
do
{
int digit= num%10;
sum=digit+sum;
num=num/10;
}
while(num!=0);

System.out.println(sum);

}

}