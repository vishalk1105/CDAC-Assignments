class Qn5 {

public static void main(String args[]){

int arr[]={5, 3, 9, 7, 1};

int max=arr[0];
int secondLarg=arr[0];


for(int i=0;i<5;i++){
if(max<arr[i]){
max=arr[i];
}
}


for(int j=0;j<5;j++){
if(max !=arr[j] && max-arr[j]<secondLarg){
secondLarg=arr[j];
}

}
System.out.print(secondLarg);
}
}