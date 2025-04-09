import java.util.Scanner;

class negative extends Exception
{
public negative(String msg){
super (msg);
}
}

public class Mycalculator{
private int n;
private int p;

Mycalculator(int n , int p){
this.n = n;
this.p = p;
}

void dis (){
System.out.println(Math.pow(this.n , this.p));

}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    try {
     System.out.println("Enter the value of n");
     int n = sc.nextInt();
     sc.nextLine();
    
    System.out.println("Enter the value of n");
     int p = sc.nextInt();
     sc.nextLine();
    
    
    Mycalculator mc = new Mycalculator(n,p);
    check(n,p);
    mc.dis();
    }
    catch (negative e){
    System.out.println("Eroor" + e );
    
    
    
}
}


private static void check(int n , int p )throws negative{

if(n <0 || p <0){
throw new negative("n and p cannot be negative");
}
if(n ==0 || p == 0){
throw new negative("n and p cannot be 0");
}

}
}
