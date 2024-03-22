class Qn2{

public static void main(String args[])
{
int []arr1={2,5,7,9,3,4,5};
int []arr2={2,5,8,9,3,4,5};
int []arr3={2,5,8,9,3,4,5,10,12};

int size= (arr1.length>arr2.length)?(arr1.length>arr2.length?arr1.length:arr3.length):(arr2.length
> arr3.length ? arr2.length:arr3.length);

if(arr1.length==arr2.length ){
boolean checkedEqual=false;
for(int i=0;i<arr2.length;i++){
if(arr1[i]==arr2[i]){
checkedEqual=true;
}else{
checkedEqual=false;
break;
}
}
if(checkedEqual){
System.out.println("Array is equal");
}else{
System.out.println("Array is not equal");
}

}

}
}