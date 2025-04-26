
import java.util.Scanner;

class lowbal extends Exception{
    public lowbal(String msg){
      super(msg);  
    }
}
class Bank{
    private double balance;
    public Bank(int balance){
        this.balance = balance;
    }

    public synchronized void deposit(double amount){
        this.balance += amount;
    }
     
    public synchronized void withdraw(double amount) throws lowbal {
        if(this.balance < amount){
            throw new lowbal("Insufficient balance to withdraw " + amount);
        }
        this.balance -= amount;
    }
     
    public double getBalance(){
       return this.balance;
    }
}

class Mytransiaction extends Thread{
    private Bank account ;
    private double amount;
    private boolean  flag;

     Mytransiaction(Bank account , double amount, boolean  flag){
        this.account = account;
        this.amount = amount;
        this.flag = flag;
    }

    @Override
    public void run(){
        if(flag){
            account.deposit(amount);
        } else {
            try {
                account.withdraw(amount);
            } catch (lowbal e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

class main3{
    public static void main (String[] args)throws InterruptedException {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the ammount you want to deposit");
        double d = sc.nextDouble();
        System.out.println("Enter the ammount you want to withdraw");
        double w = sc.nextDouble();
        Bank acc= new Bank (1000);
        Mytransiaction depo  = new Mytransiaction(acc , d ,true);
        Mytransiaction with  = new Mytransiaction(acc , w ,false);
        depo.start();
        //depo.join();
        with.start();
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
           System.err.println(e);
        }
        System.out.println(acc.getBalance());
    }
}


 