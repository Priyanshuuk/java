import java.util.Scanner;
class swich{
public static void main (String args[]){

int size = 0 ; 
Scanner sc = new Scanner(System.in);
size = sc.nextInt();
int arr[] = new int[size];

for(int i = 0 ; i < size ; i++){
arr[i] = sc.nextInt();
}


for(int i = 0 ; i < size-1 ; i++){
for(int j = i+1; j <size;j++){
if(arr[i] >arr[j] && arr[i] >0){

int temp = arr[i];
arr[i] =arr[j];
arr[j] = temp;
}


}
}
for(int i = 0 ; i < size ; i++){
System.out.println(arr[i]);
}
}
}
