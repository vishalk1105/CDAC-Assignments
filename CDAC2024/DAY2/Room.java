class Room{ 
float height;
float width;
float breadth;

void volume(){
float vol= height*width*breadth;
System.out.println(" Volume of room is " + vol);
}

void volume(float a, float b, float c){
float vol= a*b*c;
System.out.println(" Volume of the room is " + vol);
}

public static void main(String args[]){

Room r1= new Room();
Room r2= new Room();


r1.height= 3.0f;
r1.width= 5.1f;
r1.breadth= 4.5f;
r1.volume();

r2.volume(2.0f,3.1f,5.2f);

}
}
