class Qn6{

public static void main(String args[])
{
int []arr={ 24,54,31,16,82,45,67,88};

int firstLargest=arr[0];
int secondLarge=arr[0];
int thirdLargest=arr[0];
for(int i=0 ; i<=arr.length-1;i++){
if(firstLargest<arr[i]){
firstLargest=arr[i];
}
}

for(int j=0;j<arr.length-1;j++){
if(((secondLarge)>(firstLargest-arr[j+1])) && (firstLargest!=arr[j])){
secondLarge=arr[j+1];
}

for(int k=0;k<arr.length-1;k++){
if(((thirdLargest)<(secondLarge-arr[k+1])) && (secondLarge!=arr[k]) && (secondLarge-arr[k]>0)){
thirdLargest=arr[k];
}
}
}
System.out.println(thirdLargest+ "  " + secondLarge);
}
}