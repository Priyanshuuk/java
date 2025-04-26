class table{
    synchronized (this){
    void ptable(int x){
        for(int i = 0 ; i <5; i++){
        System.out.println(i*x);
        }

        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    }
}

class A extends Thread{
    table t;
    A(table t){
        this.t  = t;
    }

    public void run(){
        t.ptable(2);
    }
}


class B extends Thread{
    table t;
    B(table t){
        this.t  = t;
    }

    public void run(){
        t.ptable(2);
    }
}


class main4{
    public static void main (String[] args){
                table t = new table();
                A t1 = new  A(t);
                B t2 = new B (t);
                t1.start();
                t2.start();
    }
}
