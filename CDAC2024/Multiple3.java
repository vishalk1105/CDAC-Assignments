import java.util.Scanner;

class Multiple3{

public static void main(String args[]){

int n;
int size=0;
int sum=0;
Scanner num=new Scanner(System.in);
n=num.nextInt();

for(int i=1;i<=n;i++){
int t = 2*(i-1);
if(t <= n){
size++;
}
}

int arr[] = new int[size];

for(int j=0;j<n;j++){
arr[j]=2*(j-1)*3;              
}

for(int j=0;j<size;j++){
System.out.println(arr[j]);
}


if(n<0)
{System.out.println("Invalid Input");
}
else{
for(int i=0;i<size;i++){

if( arr[i]%3==0 ){
System.out.println(arr[i]+" t");
sum = sum + arr[i];
}
}
} 

for(int h=1;h<=n;h++){
 for(int j=0;j<size;j++){
if(arr[j]==h && h%3==0){

sum = sum + h;
}
}
}

System.out.println(sum);
}
}