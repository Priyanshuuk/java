import java.util.Scanner;
class zigzag{

public static void main (String args[]){
int size;
Scanner sc = new Scanner(System.in);
size = sc.nextInt();
int arr[]=new int[size];
int ans[] = new int[size];
int k = 0 ;
for(int i = 0 ; i < size ; i++){
arr[i] = sc.nextInt();

}
System.out.println("The array is  :");


for(int i = 0 ; i <size-1 ; i++){
 if (i % 2 == 0) {
 if (arr[i] > arr[i + 1]) {
  int temp = arr[i];
 arr[i] = arr[i + 1];
   arr[i + 1] = temp;
                }
            } 
          
  else {   
   if (arr[i] < arr[i + 1]) {
    int temp = arr[i];
     arr[i] = arr[i + 1];
      arr[i + 1] = temp;
                }
            }
}
for(int i = 0 ; i < size ; i++){

System.out.println(arr[i]);
}
}
}
