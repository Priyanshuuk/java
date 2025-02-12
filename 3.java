import java.util.Scanner;
class Friendly{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number : ");
int data = sc.nextInt();
int data2 = sc.nextInt();
int sum = 0 ; 
int sum2 = 0 ; 

for(int i = 1 ; i < data; i++){
if(data %i ==0){
sum += i;

}


}
for(int i = 1 ; i < data2; i++){
if(data2 %i ==0){
sum2 += i;

}


}
int a = sum/data;
int b = sum2/data2;
if(a == b){
System.out.println("It is a friendly number") ;

}
else{
System.out.println("It is a non friendly number") ;

}
}
}
