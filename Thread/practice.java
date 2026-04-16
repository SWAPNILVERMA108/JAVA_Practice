import java.lang.management.ThreadMXBean;

public class practice {
    public static void main(String[] args){
    System.out.println("main thread is runnning 1");
    MyThread t = new MyThread();
    t.start();


    MyRunnable obj = new MyRunnable();
    Thread t1 = new Thread(obj);
    t1.start();

    A a = new A();
    B b = new B();
    a.start();
    b.start();


    new sleepDemo().start();

    new yieldDemo().start();

    new joinDemo().start();

    priorityDemo t5 = new priorityDemo();
    t5.setPriority(Thread.MAX_PRIORITY);
    t5.start();


    }

    
    
}
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running 2");
    }

}
class MyRunnable implements Runnable {
    public void run(){
        System.out.println("Thread is running 3");
    }
    
} 
class A extends Thread{
    public void run(){
        System.out.println("Thread A");
    }   
}
class B extends Thread{
    public void run(){
        System.out.println("Thread B");
    }
}

class sleepDemo extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);

        }catch(Exception e){
            
        }
        System.out.println("After sleep");
    }
}


// Give chance to other threads.

class yieldDemo extends Thread{
    public void run(){
        Thread.yield();
        System.out.println("Yield Executed");
    }


}

// join() : One thread waits for another.

class joinDemo extends Thread{
    public void run(){
        System.out.println("Thread running (join)");
    }
}


// Thread Priority Priority range: 1 – 10

class priorityDemo extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}