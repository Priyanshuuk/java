import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String one = sc.nextLine();
     int count = 0 ;
     int i = 0 ;
     while(i <one.length()-1){
       if(one.charAt(i) =='0'){
         i++;
         while(one.charAt(i)=='1'){
           i++;
         }
         count+=1;
       }
       
     
     }
      System.out.println(count);
    }
    
}
