import java.util.Scanner;
class convertone{
 
 public static void main (String args[]){
 Scanner nm = new Scanner(System.in);
 int num = nm.nextInt();
 int cpy = num ; 
 int ans = 0 ;
  int pl = 1;
 while(cpy != 0){
 int rem = cpy%10;

 if(rem == 0){
 rem = 1;
 }
 ans = ans+rem*pl;
  pl = pl*10;
 cpy = cpy/10;
 
 }
 
 System.out.println(ans);
 
 
 }



}
