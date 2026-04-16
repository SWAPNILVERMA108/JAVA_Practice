class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Main5B {
    public static void main(String[] args) {
        System.out.println("Name: Swapnil Verma");
        System.out.println("Roll No: 2400320101154");
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();
    }
}

