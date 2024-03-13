import java.util.*;
class Qn5{

static public void main(String args[]){
 Scanner sc= new Scanner(System.in);
 String input = sc.nextLine().toLowerCase();
 if (input.length() != 1) {
System.out.println("Please enter a single character.");
return;
}
char ch = input.charAt(0);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
System.out.println("Vowel");
}
else{
System.out.println("Consonant");
}
}
}