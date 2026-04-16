class EvenThread extends Thread {
    int start, end;

    EvenThread(int s, int e) {
        start = s;
        end = e;
    }

    public void run() {
        System.out.println("Even Numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {  
                System.out.print(i + " ");
            }
        }
    }
}

class OddThread extends Thread {
    int start, end;

    OddThread(int s, int e) {
        start = s;
        end = e;
    }

    public void run() {
        System.out.println("\nOdd Numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {   
                System.out.print(i + " ");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        EvenThread t1 = new EvenThread(1, 20);
        OddThread t2 = new OddThread(1, 20);

        t1.start();
        t1.join();   

        t2.start();
    }
}