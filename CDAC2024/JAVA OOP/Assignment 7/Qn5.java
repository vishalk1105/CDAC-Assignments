class Qn5{

public static void main(String args[])
{
int []arr={2,5,7,9,3,4,5,1,55,100};
int small=arr[0];
int larg=arr[0];

for(int i=0;i<=arr.length-1;i++){ 
if(larg<arr[i]){
larg=arr[i];
}

if(small>arr[i]){
small=arr[i];
}
}

System.out.println(small+"   "+larg);

}
}