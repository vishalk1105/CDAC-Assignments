class Person {

int age;
float height;
float weight;

Person(){}

Person(int a, float h, float w){
age=a;
height=h;
weight=w;
} 

Person(int a, float h){
age=a;
height=h;
weight=60.5f;
}

void display(String name){
System.out.println(name+" Age "+age);
System.out.println(name +" Height "+height);
System.out.println(name + " Weight "+weight);
}

public static void main(String args[]){

Person max= new Person();

max.age=28;
max.height=160.4f;
max.weight=60.5f;

Person shady= new Person(32, 156.5f, 72.4f);

Person adrion= new Person(25, 158.6f);

max.display("max");
shady.display("shady");
adrion.display("adrion");
}



}