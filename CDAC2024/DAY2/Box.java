class Box {      
float height;
float width;
float breadth;

Box(){}

Box(float a, float b, float c){
height=a;
width=b;
breadth=c;
}

float getVolume(){
float vol= height*width*breadth;
return vol;

}

float getArea(){
float area= width*breadth;
return area;
}

void printdata(String ch){
float vol= getVolume();
float area= getArea();

System.out.println("The area of " + ch +" is "+ area);
System.out.println("The volume of " + ch +" is "+ vol);
}

public static void main(String args[]){

Box b1= new Box();
b1.height=2.1f;
b1.width=3.2f;
b1.breadth=4.5f;

Box b2= new Box(2.1f,5.1f,6.4f);

float b1Voulme= b1.getVolume();
float b1Area= b1.getArea();
float b2Voulme= b1.getVolume();
float b2Area= b1.getArea();

b1.printdata("Box b1");
b2.printdata("Box b2");

}



}