/* Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given  number?  */

class Qn3{

public static void main(String args[])
{
int num=10;
int []arr={2,5,7,9,3,4,5,1};

for(int i=arr.length/2;i<arr.length;i++){
   for(int j=0;j<arr.length/2;j++){
if(arr[i]+arr[j]==10 && i!=j){
System.out.println(arr[i]+"  "+arr[j]);
}
}
}

}
}