class Practice{

static String varStatic;

int a;
int b;

Practice(){
System.out.println("Constructor run");
}

{
a=10;
b=200;
varStatic="Static Variable";
System.out.println("Instatance block run");
}

static{

System.out.println("Static block run");
}

public static void main(String args[]){

Practice p1= new Practice();
Practice p2= new Practice();

System.out.println("Code Run " + varStatic);

}
}

