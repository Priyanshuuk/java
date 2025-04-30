import java.util.*;
class pc1{

LinkedList<Integer>list = new LinkedList<>();
int cap = 2;
int val = 1;

public void produce ()throws Exception{
while(true){
synchronized (this){
while(list.size()==cap){
wait();
}
System.out.println("Producer produces"+ val);
list.add(val++);
notify();
Thread.sleep(300);
}


}


}

public void consumer ()throws Exception{
while(true){
synchronized (this){
while(list.size()==0){
wait();
}
System.out.println("Consumer cosumes"+ list.removeFirst());

notify();
Thread.sleep(300);
}


}

}
}


class A extends Thread{
pc1 p ; 
public A(pc1 p ){
this.p = p ;
}


public void run(){
try{
p.produce();
}
catch (Exception e){
System.out.println(e);
}
}
}

class B extends Thread{
pc1 p ; 
public B(pc1 p ){
this.p = p ;
}


public void run(){
try{
p.consumer();
}
catch (Exception e){
System.out.println(e);
}
}
}


class main2{
public static void main(String []  args){

pc1 p = new pc1();
A t = new A (p);
B t1 = new B(p);
t.start();
t1.start();
}
}

