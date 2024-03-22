class Qn8{

public static void main(String args[]){

int []arr={5,14,35,89,140};
int avg=0;
int size=arr.length;
if(size<3){
System.out.println("Size is less than 3");
} else {
for(int i=0;i<size-2;i++){
avg=(arr[i]+arr[i+1]+arr[i+2])/3;
System.out.println(avg);
}
}
}
}