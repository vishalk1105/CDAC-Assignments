//pass array to method
/* class Practice{


static void min(int arr[]){

int min= arr[0];

for(int i=1;i<arr.length;i++){

if(min>arr[i]){
min=arr[i];
}
}
System.out.println(min);
}


static public void main(String args[]){
int a[]={33,3,5,4};
min(a);
}
}
*/

//Anonymous Array passed in method
/*
class Practice{

static void printArray(int a[]){
for(int i : a){
System.out.println(i);
}

}

static public void main(String args[]){
printArray(new int []{10,24,35,5});

}
}
*/

// Jagged Array
/* class Practice{

static public void main(String args[]){

int arr[][]= new int [3][];
 arr[0]= new int[4];
 arr[1]= new int [3];
 arr[2]= new int [1];

int count=0;

for(int i=0;i<arr.length;i++){
  for(int j=0; j<arr[i].length;j++){
arr[i][j]=count++;

}
}

for (int a[]: arr){
  for(int b: a){
System.out.print(b+" ");
}
}
System.out.println();
for(int i=0;i<arr.length;i++){
  for(int j=0; j<arr[i].length;j++){
System.out.print(arr[i][j]+" ");

}
System.out.println();
}

}
}

*/

//array is an object and has a class name

/*
class Practice{

static public void main(String args[]){
int arr[]={1,2,4,54,47};

Class c=arr.getClass();
String name=c.getName();

System.out.println(name);

}
}

*/

//Copy of array
/* class Practice{

static public void main(String args[]){

char a[]={ 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };

char b[]=new char[7];

System.arraycopy(a,3,b,0,7);
System.out.println(String.valueOf(b));

}
}

*/


//Cloning of 1-D array
/* class Practice{

static public void main(String args[]){

int arr[]={33,5,4,7};

int carr[]=arr.clone();

for(int a: carr) 
System.out.println(a);


System.out.println(arr==carr);
}
}
*/

/* class Practice{

static public void main(String args[]){

int arr[][]={{33,5},{4,7}};

int carr[][]=arr.clone();

for(int a[]: carr){
  for(int b :a){
System.out.println(a);
}
}
System.out.println(arr==carr);
}
}
//output
[I@15db9742
[I@15db9742
[I@6d06d69c
[I@6d06d69c
false

*/













