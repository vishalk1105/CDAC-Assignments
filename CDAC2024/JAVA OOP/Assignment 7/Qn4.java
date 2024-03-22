class Qn4{

public static void main(String args[])
{
int num=10;
int []arr={2,5,7,9,3,4,5,1};
//System.out.println(arr.length);

for(int i=0;i<arr.length/2;i++){
   int temp=arr[arr.length-i-1];
arr[arr.length-i-1]=arr[i];
arr[i]=temp;
}

for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+ " ");
}
}
}