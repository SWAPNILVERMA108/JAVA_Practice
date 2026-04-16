// class MyThread extends Thread {
//     public void run() {
//         System.out.println("Thread running");
//     }

//     public static void main(String[] args) {
//         MyThread t = new MyThread();
//         t.start();
//     }
// }

// class A extends thread {
//     public static void main(String[] args) {
//         for(int i=0;i<5;i++){
//             if(i==1){
//                 yield();
//             }
//             System.out.println("form thread A "+i);
//         }
//         System.out.println("exist from A");
// }
// class B extends thread {
//     public static void main(String[] args) {
//         for(int i=0;i<5;i++){
//             if(i==3){
//                 yield();
//             }
//             System.out.println("form thread B "+i);
//         }
//         System.out.println("exist from B");
// }
// class C extends thread {
//     public void main(String[] args) {
//         for(int i=0;i<5;i++){
//             if(i==1){
//                 try {
//                     sleep(1000);
//                 } catch (InterruptedException e) {
//                    System.out.println(e);
//                 }

//             }
//             System.out.println("form thread C "+i);
//         }
//         System.out.println("exist from C");
// }

// A thredA = new A();
// B thredB = new B();
// C thredC = new C();




class A extends Thread {
    public void run() {
        for(int i=0;i<5;i++){
            if(i==1){
                Thread.yield();
            }
            System.out.println("form thread A "+i);
        }
        System.out.println("exist from A");
    }
}

class B extends Thread {
    public void run() {
        for(int i=0;i<5;i++){
            if(i==3){
                Thread.yield();
            }
            System.out.println("form thread B "+i);
        }
        System.out.println("exist from B");
    }
}

class C extends Thread {
    public void run() {
        for(int i=0;i<5;i++){
            if(i==1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                   System.out.println(e);
                }
            }
            System.out.println("form thread C "+i);
        }
        System.out.println("exist from C");
    }
}

class Test {
    public static void main(String[] args) {
        A thredA = new A();
        B thredB = new B();
        C thredC = new C();

        System.out.println("start thread A");
        thredA.start();
        System.out.println("start thread B");   
        thredB.start();
    }
}