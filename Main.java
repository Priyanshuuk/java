import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String one = sc.nextLine();
     int count = 0 ;
     int i = 0 ;
     int s = -1;
     int e = -1;
     while(i <one.length()-1){
       if(one.charAt(i) =='0'){
         i++;
         s = i;
         while(one.charAt(i)=='1'){
           i++;
         }
         e = i ;
         count+=1;
        
       }
        if(one.charAt(i)=='1'){i++;}

        for(int j = s-1 ; j < e+1; j++  ){
         System.out.print(one.charAt(j));
        }
        System.out.println();
          System.out.println(count);
         
          
     
     }
    
    }
    
}
