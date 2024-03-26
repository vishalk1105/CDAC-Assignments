//Write a Java program throws an array index out of bound exception.
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
class Qn3{

public static void main(String args[]){
int []arr={10,20,30};

try{
for(int i=0;i<5;i++)
{
System.out.println(arr[i]);
if(i>arr.length){
throw new ArrayIndexOutOfBoundsException("Array out of bound");
}
}

}catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println("index is greater than length");
}

}

}